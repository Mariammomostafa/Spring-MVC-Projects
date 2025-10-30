package com.selenium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.selenium.config.dto.EmailDto;
import com.selenium.config.dto.RegisterDto;
import com.selenium.config.dto.UserDto;
import com.selenium.service.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService ;

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
		
		EmailDto emailDto = new EmailDto();
		model.addAttribute("emailDto", emailDto);
		
		
		return "showEmail";
	}
	
	@PostMapping("/process-email")
	public String processEmail(@SessionAttribute("dto") RegisterDto dto 
			            
			,  @ModelAttribute("emailDto") EmailDto emailDto) {
		
		emailService.sendEmail(dto.getName(), emailDto.getEmail(), "Friend");
		
		return "process-email";
	}
}
