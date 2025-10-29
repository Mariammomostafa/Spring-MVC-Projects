package com.selenium;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import jakarta.servlet.http.HttpSession;

@Controller
public class FirstController {
	

	@RequestMapping("/first")
	public String first(Model model , HttpSession session) {
	
		session.setAttribute("firstName", "mariam");
		session.setAttribute("secondName", "mostafa");
		session.setAttribute("address", "cairo");
		
		
		model.addAttribute("firstName", session.getAttribute("firstName"));
				
		model.addAttribute("next", "second");
				
		return "index";
	}
	
	@RequestMapping("/second")
	public String second(Model model2 ,HttpSession session ) {
		
		// if we want copy sessions's attributes to the model of any request , do this
		model2.addAttribute("firstName", session.getAttribute("firstName"));
		
		model2.addAttribute("next", "third");
			
		return "index";
	}
	
	@RequestMapping("/third")
	public String third(Model model , SessionStatus status,HttpSession session) {
		
		// if we want copy sessions's attributes to the model of any request , do this
		model.addAttribute("firstName", session.getAttribute("firstName"));
		
		//if we try stop session at this method , this will NOT work with HttpSession
		status.setComplete();
		
		model.addAttribute("next", "newMethod");

		return "index";
	}
}
