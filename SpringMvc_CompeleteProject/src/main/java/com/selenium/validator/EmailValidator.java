package com.selenium.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.selenium.config.dto.RegisterDto;

public class EmailValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return RegisterDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
	String email=((RegisterDto)target).getCommunicationDto().getEmail();
	
	
		ValidationUtils.rejectIfEmpty(errors, "communicationDto.email", "email.empty");
	
	if(!email.endsWith("@selenium.com")) {
		
		errors.rejectValue("communicationDto.email", "email.invalidDomain");
	}
		
	}

}
