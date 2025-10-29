package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.config.dto.EmailDto;

@Controller
public class EmailController {
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(Model model ) {
		
		EmailDto emailDto = new EmailDto();
		model.addAttribute("emailDto", emailDto);
			
		return "showEmail";
	}
	
	@PostMapping("/process-email")
	public String processEmail(Model model, @ModelAttribute("emailDto") EmailDto emailDto) {
				
		return "process-email";
	}
}
