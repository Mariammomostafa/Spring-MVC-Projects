package com.selenium.controller;

import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.config.dto.RegisterDto;
import com.selenium.config.dto.UserDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class RegisterController {

	@RequestMapping("/home")
	public String welcome(Model model ,HttpSession session) {

		String name =(String) model.getAttribute("username");
		
		System.out.println(name);
		
		UserDto userDto = new UserDto();
		model.addAttribute("userDto", userDto);
		
		return "home";
	}

	@PostMapping("/process")
	public String showResult(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> allErrors = result.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}

			return "home";

		} else {

			return "result";
		}
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute("dto") RegisterDto registerDto) {

	

		return "register";
	}

	@PostMapping("/process-register")
	public String processRegister(HttpServletRequest request ,@Valid @ModelAttribute("dto") RegisterDto registerDto, 
			BindingResult result) {

		// create Session
		HttpSession session = request.getSession();
		
		session.setAttribute("username", registerDto.getName());
		session.setMaxInactiveInterval(10);

		

		System.out.println("inside controller after successful register...");

		if (result.hasErrors()) {

			List<ObjectError> allErrors = result.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}

			return "register";

		}else {
			

			return "registeration-success";
		}

	
	}

	@InitBinder("dto")
	public void binder(WebDataBinder binder) {

		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
		binder.setDisallowedFields("password");

	}
}
