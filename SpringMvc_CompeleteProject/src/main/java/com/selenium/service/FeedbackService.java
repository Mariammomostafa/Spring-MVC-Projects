package com.selenium.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void feedBack(String name , String userEmail , String text) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		System.out.println(userEmail);
	
		message.setTo("mariam631985@gmail.com");
	    message.setText("Feedback from :" + name + "\n Email : " + userEmail + 
	    		"\n Content : " + text );
	    
	    javaMailSender.send(message);
	    
		
	}

}
