package com.selenium.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CommunicationDto {
	
	@NotEmpty(message = "  * Email can NOT be blank")
	@Email(message = " * Email NOt valid" , regexp = ".+@.+\\..+")
	private String email ;
	
	
	@NotNull(message = "  * Phone can NOT be blank")
	private Phone phone ;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	

}
