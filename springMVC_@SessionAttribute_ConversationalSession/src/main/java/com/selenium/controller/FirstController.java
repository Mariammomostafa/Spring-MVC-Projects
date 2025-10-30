package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes({"firstName" , "secondName" ,"address"})
public class FirstController {
	

	@RequestMapping("/first")
	public String first(Model model ) {
	
		model.addAttribute("firstName", "mariam");
		model.addAttribute("secondName", "mostafa");
		model.addAttribute("address", "cairo");
		
		
		model.addAttribute("next", "second");
				
		return "index";
	}
	
	@RequestMapping("/second")
	public String second(Model model2 ,HttpServletRequest req) {
		
		String name1 = (String) model2.getAttribute("firstName");
		String name2 = (String) model2.getAttribute("secondName");
		
		System.out.println("inside second() method  " + name1 + " " + name2);
				
		model2.addAttribute("next", "third");
			
		return "index";
	}
	
	@RequestMapping("/third")
	public String third(Model model ,HttpServletRequest req , SessionStatus status) {
		
	
		//if we want to stop session at this method
		//status.setComplete();
		
		
		model.addAttribute("next", "newMethod");

		return "index";
	}
}
