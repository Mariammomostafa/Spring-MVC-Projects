package com.selenium.service;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Service;

import jakarta.mail.Address;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

@Service
public class MimeMessageServerice {
	
     //get the whole path of file location & assign this value inside MimeBodyPart.addAttach()
	
    // File attachmentFile = new File("static/certificates.pdf");
    //System.out.println("Attempting to attach file: " + attachmentFile.getAbsolutePath());
	
	public Session getSession() {
		
		System.out.println(" inside getSession() ");

		Properties properties = new Properties();
		properties.put("mail.smtp.auth" , true);
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.transport.protocol", "smtp");
		
		Session session = Session.getInstance(properties, new Authenticator() {
			
			@Override
			 protected PasswordAuthentication getPasswordAuthentication() {
				      
				return new PasswordAuthentication("mariam631985@gmail.com", "rfmq wjrl chyy plbc");
		     }
		});
		
		return session;
	}
	
	public void sendMessage(String userEmail) throws MessagingException, IOException {
		
		System.out.println(" inside usereMaiL() 1");
		
		Message message = new MimeMessage(getSession());
		message.setSubject("Message from java project");
		
		Address address = new InternetAddress(userEmail);
		message.setRecipient(Message.RecipientType.TO, address);
		
		MimeMultipart multipart = new MimeMultipart();
		
		MimeBodyPart attachment1 = new MimeBodyPart();
		String filepath = "C:\\Users\\LAP TOP\\eclipse-workspace\\springMVC_SendEmail_MimeMessage\\static\\java.pdf";
		attachment1.attachFile(new File(filepath));
		
		MimeBodyPart attachment2 = new MimeBodyPart();
		attachment2.attachFile(new File("C:\\Users\\LAP TOP\\eclipse-workspace\\springMVC_SendEmail_MimeMessage\\static\\sea.jpeg"));
		
		MimeBodyPart messageBodyPart = new MimeBodyPart();	
		messageBodyPart.setContent("<h1> welcome to our java project </h1>" , "text/html");
		
		multipart.addBodyPart(messageBodyPart);
		multipart.addBodyPart(attachment1);
		multipart.addBodyPart(attachment2);
		
		message.setContent(multipart);
		System.out.println(" inside usereMaiL() 2 ");
		Transport.send(message);
	
	}
	

}
