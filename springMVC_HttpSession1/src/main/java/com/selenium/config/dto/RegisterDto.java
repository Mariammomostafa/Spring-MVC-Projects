package com.selenium.config.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RegisterDto {
	
	@NotEmpty(message =  "{name.empty}")
	@Size(min = 3 , max =7, message = "{name.size}")
	private String name;
	
	@NotEmpty(message = "{username.empty}")
	@Size(min = 3 , max =7, message = "{username.size}")
	private String username;
	
	private char[] password;
	
	private String countryName;
	
	private String[] hobbies;
	
	private String gender;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


		



}
