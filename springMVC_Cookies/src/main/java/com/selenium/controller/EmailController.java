package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.config.dto.EmailDto;

@Controller
public class EmailController {
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@CookieValue("app.username") String name ,Model model ) {
		
		EmailDto emailDto = new EmailDto();
		model.addAttribute("emailDto", emailDto);
		model.addAttribute("username", name);
		
		return "showEmail";
	}
	
	@PostMapping("/process-email")
	public String processEmail(@CookieValue("app.username") String name ,Model model, @ModelAttribute("emailDto") EmailDto emailDto) {
		
		model.addAttribute("username", name);
		
		return "process-email";
	}
}
