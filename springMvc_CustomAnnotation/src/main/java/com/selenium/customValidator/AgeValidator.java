package com.selenium.customValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	
	int lowe = 18 ;
	int upper = 40 ;
	
	@Override
	public void initialize(Age age) {
		
		this.lowe = age.lower();
		this.upper = age.upper();
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		
		if(value == null) {
		
			return false ;
		
		}else if(value < lowe || value > upper ) {
			return false ;
		}
		
		return true;
	}

	

}
