package com.selenium.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.selenium.dto.RegisterDto;

public class EmailValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return RegisterDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		System.out.println("inside Email validator");
		System.out.println(target);

		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email","email.empty", " * Email can Not be empty");
		
		String email = ((RegisterDto)target).getEmail();
		
		if(!email.endsWith("express.com")) {
			
			errors.rejectValue("email", "email.invalidEmail" ," * Email MUST end with express.com");
		}
		
	}

}
