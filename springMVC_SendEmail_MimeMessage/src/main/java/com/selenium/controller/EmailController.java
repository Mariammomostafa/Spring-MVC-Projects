package com.selenium.controller;

import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.selenium.config.dto.EmailDto;
import com.selenium.config.dto.UserDto;
import com.selenium.service.MimeMessageServerice;

import jakarta.mail.MessagingException;

@Controller
public class EmailController {
	
	Logger logger = Logger.getLogger(EmailController.class.getName());
	

	
	@Autowired
	private MimeMessageServerice mimeMessageServerice;

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
		
		EmailDto emailDto = new EmailDto();
		model.addAttribute("emailDto", emailDto);
		
		
		return "showEmail";
	}
	
	@PostMapping("/process-email")
	public String processEmail(@SessionAttribute("userDto") UserDto dto 
			            
			,  @ModelAttribute("emailDto") EmailDto emailDto) {
				
			try {
				
				mimeMessageServerice.sendMessage(emailDto.getEmail());
				
			} catch (MessagingException e) {
				
                logger.info(" some thing went wrong ...."+e.getMessage());
				return "showEmail";
				
			} catch (IOException e) {
				
				logger.info(" some thing went wrong ...." + e.getMessage());
				return "showEmail";
			}
			
		
		
		return "process-email";
	}
}
