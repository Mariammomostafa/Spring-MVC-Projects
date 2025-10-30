package com.selenium.dto;


import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginDto {

	
	@NotEmpty(message = "  * username can NOT be blank")
	@Size(min = 3 , max = 7 , message = "  * username length between 3 - 7")
    private String username ;
	
	@NotEmpty(message = "   * username can NOT be blank")
	@Size(min = 5 , max = 10 , message = "   * password length between 5 - 10")
	private String password ;
	
	@AssertTrue(message = " * You Must agree before login")
	private boolean termAndCondition ;
	
	private String food;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	
}
