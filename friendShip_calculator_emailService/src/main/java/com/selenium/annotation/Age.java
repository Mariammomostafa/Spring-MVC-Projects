package com.selenium.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = AgeValidator.class) // this is implementation  of this specification
public @interface Age {
	
	String message() default "{invalidAgeMessage}";
	
	int lower() default 17;
	int upper() default 30;
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };


}
