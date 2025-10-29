package com.selenium.controller;

import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.dto.RegisterDto;
import com.selenium.validator.EmailValidator;

import jakarta.validation.Valid;

@Controller
public class RegisterationController {

	

	@RequestMapping("/register")
	public String register(@ModelAttribute("dto") RegisterDto registerDto) {

		
		return "regiseration";
	}

	@RequestMapping("/process-register")
	public String processRegister(@Valid @ModelAttribute("dto") RegisterDto registerDto , BindingResult bindingResult) {

		System.out.println("inside handler method of controller");
		System.out.println(registerDto);
		
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}
			return "regiseration";
		} else
		
		return "viewInfo";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		
		System.out.println(" inside @InitBinder method");
		
		// to remove white spaces from username before binding it to the dto object
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "username", editor);
		
		binder.addValidators(new EmailValidator());
		
	}

}
