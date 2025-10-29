package com.selenium.controller;

import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.dto.LoginDto;
import com.selenium.validator.UsernameValidator;

import jakarta.validation.Valid;

@Controller
public class LoginController {

	
	@RequestMapping("/login")
	public String login(@ModelAttribute("loginDto") LoginDto loginDto) {

		return "login";
	}

	@PostMapping("/process-login")
	public String processLogin(@Valid @ModelAttribute("loginDto") LoginDto dto, BindingResult bindingResult) {

		System.out.println("inside handler method ");
		System.out.println(dto);
		
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}
			return "login";
		} else
			return "loginInfo";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {

		System.out.println("inside @InitBinder");
		
		// to remove white spaces from username before binding it to the dto object	
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "username", editor);
		
		binder.addValidators(new UsernameValidator());
		
	}
}
