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

import com.selenium.dto.CreditCard;
import com.selenium.dto.LoginDto;
import com.selenium.dto.RegisterDto;
import com.selenium.editors.CreditCardEditor;
import com.selenium.editors.UpperCaseEditors;

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

		CreditCard object = new CreditCard();
		object.setFirstFourDigit(1111);
		object.setSecondFourDigit(1111);
		object.setThirdFourDigit(1111);
		object.setLastFourDigit(1111);
		
		registerDto.setCreditCard(object);
		return "regiseration";
	}

	@RequestMapping("/process-register")
	public String processRegister(@Valid @ModelAttribute("dto") RegisterDto registerDto , BindingResult bindingResult) {

		System.out.println("inside Handler method");
		System.out.println(registerDto.getCreditCard());
		
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
		
		System.out.println("inside @InitBinder");
		
		// to remove white spaces from username before binding it to the dto object
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "username", editor);
		
		//edit the username value & convert it to uppercase
		UpperCaseEditors upperCaseEditors = new UpperCaseEditors();
		binder.registerCustomEditor(String.class, "username", upperCaseEditors);
		
		// disable value of password text box from setting it into dto obj
		binder.setDisallowedFields("password");
		
		//apply editor to convert from String to CreditCard obj
		binder.registerCustomEditor(CreditCard.class, "creditCard", new CreditCardEditor());
		
	}

}
