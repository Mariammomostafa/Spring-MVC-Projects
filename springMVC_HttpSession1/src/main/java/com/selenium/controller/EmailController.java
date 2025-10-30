package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.config.dto.EmailDto;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmailController {
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(Model model , HttpSession session ) {
		
        String username =(String) model.getAttribute("username");
		System.out.println(username);
		
		String name = (String) session.getAttribute("username");
		System.out.println(name);
		
		
		EmailDto emailDto = new EmailDto();
		model.addAttribute("emailDto", emailDto);
			
		return "showEmail";
	}
	
	@PostMapping("/process-email")
	public String processEmail(Model model, @ModelAttribute("emailDto") EmailDto emailDto) {
				
		return "process-email";
	}
}
