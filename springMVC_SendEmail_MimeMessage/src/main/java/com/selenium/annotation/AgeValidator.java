package com.selenium.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements  ConstraintValidator<Age , Integer>{

	int lower ;
	int upper ;
	
	@Override
	public void initialize(Age age) {
	
		System.out.println("inside initialize()");
		
		this.lower = age.lower();
		this.upper = age.upper();
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {

		System.out.println("inside isValid()");

		
          if(value == null )
        	  return false;
          
          if(value < lower || value > upper )
        	  return false;
		
		return true;
	}

}
