package com.selenium.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.dto.LoginDto;
import com.selenium.dto.RegisterDto;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@RequestMapping("/login")
	public String login(@ModelAttribute("loginDto") LoginDto loginDto) {

		return "login";
	}

	@PostMapping("/process-login")
	public String processLogin(@Valid @ModelAttribute("loginDto") LoginDto loginDto, BindingResult bindingResult) {

		System.out.println("process login");
		
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}
			return "login";
		} else
			return "loginInfo";
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute("dto") RegisterDto registerDto) {

		return "regiseration";
	}

	@RequestMapping("/process-register")
	public String processRegister(@Valid @ModelAttribute("dto") RegisterDto registerDto , BindingResult bindingResult) {

		System.out.println(registerDto.getUsername());

		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}
			return "regiseration";
		} else
		
		return "viewInfo";
	}

}
