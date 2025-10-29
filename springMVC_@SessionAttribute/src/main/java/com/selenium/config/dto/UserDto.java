package com.selenium.config.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserDto {
	
	@NotEmpty(message = "{username.empty}")
	@Size(min = 3 , max =7, message = "{username.size}")
	private String name ;
	
	@NotEmpty(message = "{crshName.empty}")
	@Size(min = 3 , max =7, message = " {crshName.size}")
	private String crushName ;
	
	@AssertTrue(message = " * You have to agree to use our app ..")
	private boolean termAndCondition;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	
	

}
