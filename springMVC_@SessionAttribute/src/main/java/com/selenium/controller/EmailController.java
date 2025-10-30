package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.selenium.config.dto.EmailDto;
import com.selenium.config.dto.RegisterDto;

@Controller
public class EmailController {
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(Model model , @SessionAttribute("dto") RegisterDto registerDto) {
		
		String username = registerDto.getUsername();
		System.out.println(username);
		
		EmailDto emailDto = new EmailDto();
		model.addAttribute("emailDto", emailDto);
			
		return "showEmail";
	}
	
	@PostMapping("/process-email")
	public String processEmail(Model model, @ModelAttribute("emailDto") EmailDto emailDto) {
				
		return "process-email";
	}
}
