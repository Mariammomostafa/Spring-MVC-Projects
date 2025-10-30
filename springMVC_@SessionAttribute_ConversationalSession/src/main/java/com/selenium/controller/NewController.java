package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class NewController {

	@RequestMapping("/newMethod")
	public String method(Model model, HttpServletRequest req, @SessionAttribute("firstName") String username) {

		// model of this request does NOT contains any attributes
		// due to all attributes from the session will be copied to all models
		// in the same controller annotated by @SessionAttribute (this annotation
		// specific to controller's model attributes)& NOT be copied for other models in
		// different controllers

		// String name =(String) model.getAttribute("firstName");
		// System.out.println("inside method() method " +name);

		HttpSession session = req.getSession();

		model.addAttribute("firstName", session.getAttribute("firstName"));
		
		System.out.println((String) model.getAttribute("firstName"));

		/************************************************/

		// Session still remains it's attributes across different controllers
		// can get session attributes from request OR @SessionAttribute

		System.out.println(username);

		// if we want to get Attribute from model NOT session , get it first from
		// session , than add it to attribute

		return "index";

	}

}
