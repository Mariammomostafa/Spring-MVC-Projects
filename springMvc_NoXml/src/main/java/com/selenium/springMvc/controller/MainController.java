package com.selenium.springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@Autowired
	private Student student;

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		
		return "welcome :" + student.getName();
	}
}
