package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class NewController {
	
	
	@RequestMapping("/newMethod")
	public String method(Model model  ,HttpSession session ) {
		
	      
	model.addAttribute("firstName", session.getAttribute("firstName"));
	
		String name =(String) model.getAttribute("firstName");
		System.out.println("inside method() method" +name);
		
		/************************************************/
		
		//We can remove all attributes from HttpSession using session.invalidate() without throw exception
		
		session.invalidate();
		
		return "index";
		
	}

}
