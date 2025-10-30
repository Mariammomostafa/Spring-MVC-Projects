package com.selenium.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.selenium.config.dto.EmailDto;
import com.selenium.config.dto.FeedBackDto;
import com.selenium.config.dto.UserDto;
import com.selenium.service.EmailService;
import com.selenium.service.FeedbackService;

@Controller
public class EmailController {
	
	Logger logger = Logger.getLogger(EmailController.class.getName());
	
	@Autowired
	private EmailService emailService ;
	
	@Autowired
	private FeedbackService feedbackService;

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model ) {
		
		EmailDto emailDto = new EmailDto();
		model.addAttribute("emailDto", emailDto);
		
		
		return "showEmail";
	}
	
	@PostMapping("/process-email")
	public String processEmail(@SessionAttribute("userDto") UserDto dto 
			            
			,  @ModelAttribute("emailDto") EmailDto emailDto ) {
				
		try {
			emailService.sendEmail(dto.getName(),  dto.getCrushName(),emailDto.getEmail(), dto.getAppResult());
			
		} catch (Exception e) {
			
			logger.info("error while sending mail ....");
			
			return "showEmail";
		}
		
		return "process-email";
	}
	
	@RequestMapping("/sendFeedback")
	public String showFeedbackForm(@ModelAttribute("feedbackDto") FeedBackDto dto) {
		
		return "feedback";
	}
	
	@PostMapping("process-feedback")
	public String sendFeedback(@SessionAttribute("userDto") UserDto userDto ,@ModelAttribute("feedbackDto") FeedBackDto dto) {
		
		System.out.println(dto.getEmail());
		
		feedbackService.feedBack(dto.getName(), dto.getEmail(), dto.getFeedback());
		emailService.sendEmail(dto.getName(),  userDto.getCrushName(),dto.getEmail(), userDto.getAppResult());
		
		return "feedback-success";
		
	}
	
	
	
	
	
	
	
}
