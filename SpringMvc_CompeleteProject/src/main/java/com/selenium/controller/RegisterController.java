package com.selenium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.SessionAttributes;

import com.selenium.config.dto.CommunicationDto;
import com.selenium.config.dto.Phone;
import com.selenium.config.dto.RegisterDto;
import com.selenium.config.dto.UserDto;
import com.selenium.editor.CustomNameEditor;
import com.selenium.editor.EmailValidator;
import com.selenium.editor.UserNameValidator;
import com.selenium.service.AppService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@SessionAttributes({"userDto" , "emailDto"})
public class RegisterController {
	
	
	@Autowired
	private AppService appService;

	@RequestMapping("/home")
	public String welcome(Model model , HttpSession session) {
		
		

		model.addAttribute("userDto" , new UserDto());
		
		return "home";
	}

	
	@PostMapping("/process") 
	public String showResult(Model model ,@Valid @ModelAttribute("userDto") UserDto userDto
			, BindingResult result , HttpSession session ) {
				
		System.out.println(userDto.getName());

		if (result.hasErrors()) {

			List<ObjectError> allErrors = result.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}
			return "home";
		} else {
						
			String appResult = appService.calculateLove(userDto.getName(), userDto.getCrushName());
			//model.addAttribute("result", appResult);
			
			userDto.setAppResult(appResult);
			
			return "result";
		}
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("dto") RegisterDto registerDto ,Model model , HttpSession session) {

		Phone phone = new Phone();
		phone.setCountryCode("002");
		phone.setUserNumber("3439829");
		
		CommunicationDto communicationDto = new CommunicationDto();
		communicationDto.setPhone(phone);
		
		registerDto.setCommunicationDto(communicationDto);
		
		System.out.println("inside controller before go to register page ...");
		// go to print() of phone formatter before go to register page 
				
		return "register";
	}

	@PostMapping("/process-register")
	public String processRegister(@Valid @ModelAttribute("dto") RegisterDto registerDto , BindingResult result) {

		// go to parse() of phone formatter before enter this method 
		
		System.out.println("inside controller after successful register...");

		if (result.hasErrors()) {

			List<ObjectError> allErrors = result.getAllErrors();

			for (ObjectError error : allErrors) {

				System.out.println(error);
			}

			return "register";

		}
		
		return "registeration-success";
	}
	
	@InitBinder("dto")
	public void binder(WebDataBinder binder) {
		
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
		binder.setDisallowedFields("password");
		
		
		CustomNameEditor nameEditor = new CustomNameEditor();
		binder.registerCustomEditor(String.class, "name", nameEditor);
		
		binder.addValidators(new UserNameValidator());
		binder.addValidators(new EmailValidator());
	}
}
