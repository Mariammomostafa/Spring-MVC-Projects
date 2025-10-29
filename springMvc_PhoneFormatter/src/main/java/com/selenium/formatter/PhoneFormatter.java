package com.selenium.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.selenium.dto.Phone;


public class PhoneFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		
		System.out.println(" inside print() of PhoneFormatter ");

		
		String countryCode = phone.getCountryCode();
		String userNumber = phone.getUserNumber();
		
		String convertedPhone = countryCode +"-"+userNumber;
		
		return convertedPhone;
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		
		System.out.println(" inside parse() of PhoneFormatter ");
		
		
		Phone phone = new Phone();
		
		if(text.contains("-") && text.indexOf("-") == 2) {
			
			String[] str = text.split("-");
					
			phone.setCountryCode(str[0]);
			phone.setUserNumber(str[1]);
			
			//return phone;
			
		}else if(text.indexOf("-") != 2) {
			
			// in case of enter number like this -->  2-37586433 OR 0234-567849
			
			 String substring = text.substring(text.indexOf("-")+1);
			 System.out.println(substring);
			
			phone.setCountryCode("02");
			phone.setUserNumber(substring);
		}
		
	  return phone ;
		
	}

}
