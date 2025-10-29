package com.selenium.dto;

import java.util.Arrays;
import java.util.Currency;

import jakarta.validation.constraints.NotEmpty;

public class RegisterDto {
	
	
	@NotEmpty(message = " * username can not be empty")
	private String username ;
	
	private String password ;
	
	
	private int age ;
	
	private String country ;
	
	private String[] hobbies;
	
	private String gender;
	
	private CreditCard creditCard;
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	@Override
	public String toString() {
		return "RegisterDto [username=" + username + ", password=" + password + ", age=" + age + ", country=" + country
				+ ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender + "]";
	}
	
	
	
	

 
	

}
