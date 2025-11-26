package com.selenium.springMvc.controller;

import org.springframework.stereotype.Component;

@Component
public class Student {

	
	private int name = 500;

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
}
