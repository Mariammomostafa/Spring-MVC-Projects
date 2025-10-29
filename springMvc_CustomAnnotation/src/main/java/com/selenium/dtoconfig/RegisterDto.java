package com.selenium.dtoconfig;

import java.util.Arrays;

import com.selenium.customValidator.Age;

import jakarta.validation.constraints.NotEmpty;

public class RegisterDto {
	
	@NotEmpty(message = "  * username can NOT be blank")
	private String username ;
	
	@NotEmpty(message = "  * password can NOT be blank")
	private char[] password ;
	
	@Age
	private int age ;
	
	private String country ;
	
	private String[] hobbies;
	
	private String gender;
	
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
	@Override
	public String toString() {
		return "RegisterDto [username=" + username + ", password=" + Arrays.toString(password) + ", age=" + age
				+ ", country=" + country + ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender + "]";
	}
	
	
	

 
	

}
