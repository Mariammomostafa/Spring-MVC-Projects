package com.selenium.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.selenium.dto.LoginDto;

public class UsernameValidator implements Validator{

	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		System.out.println("inside username validator");
		System.out.println(target);
		
	   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty");
		
	    String name = ((LoginDto)target).getUsername();
	    
	    if( name != null) {
	    	
	    	if(!name.contains("_")) {
	    		
		    	errors.rejectValue("username", "username.invalid");
	    	}
	    	
	    	
	    }
	}

}
