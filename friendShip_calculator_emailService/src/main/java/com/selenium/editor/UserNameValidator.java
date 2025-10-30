package com.selenium.editor;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.selenium.config.dto.RegisterDto;

public class UserNameValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return (RegisterDto.class.equals(clazz));
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		// object here point to value of textbox
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username","username.empty", "username can NOT be empty ot contains spaces");
		
		String username = ((RegisterDto)object).getUsername();
		if(!username.contains("_")) {
			errors.rejectValue("username", "username.invalidString", "username MUST contain '_' ");
		}
	}

	
}
