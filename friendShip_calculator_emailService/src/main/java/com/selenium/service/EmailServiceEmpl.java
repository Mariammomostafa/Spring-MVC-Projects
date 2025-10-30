package com.selenium.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceEmpl implements EmailService{
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String username, String userEmail, String result) {
		
		
		SimpleMailMessage mailMessage= new SimpleMailMessage();
		
		mailMessage.setTo(userEmail);
		mailMessage.setSubject("Love Calculator Application Result");
		mailMessage.setText("Hi " + username 
							+ " The result predicted By Love Calculator App is : " 
							+ result);
		
		javaMailSender.send(mailMessage);
					
	}

	

}
