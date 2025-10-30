package com.selenium.config;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.selenium.config.dto.Phone;

public class PhoneFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {

		System.out.println("inside print() of phoneFormatter...");
		
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	// convert String (value of textbox ) to phone obj
	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		
		System.out.println("inside parse() of phoneFormatter...");
		
		String[] phoneArray = text.split("-");
	
		Phone phone = new Phone();

		//if user not enter country code , so "-" not found
		if(text.indexOf("-") <= 0 ) {
			
			phone.setCountryCode("002");
			phone.setUserNumber(phoneArray[1]);
		}else {
		
		phone.setCountryCode(phoneArray[0]);
		phone.setUserNumber(phoneArray[1]);
	  }
		return phone;
	}

}
