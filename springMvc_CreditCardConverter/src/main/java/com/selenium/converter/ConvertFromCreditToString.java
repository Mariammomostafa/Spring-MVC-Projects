package com.selenium.converter;

import org.springframework.core.convert.converter.Converter;

import com.selenium.dto.CreditCard;

public class ConvertFromCreditToString implements Converter<CreditCard, String>{

	@Override
	public String convert(CreditCard obj) {
		
		return obj.getFirstFourDigit()+"-"+ obj.getSecondFourDigit()+"-"+
		        obj.getThirdFourDigit()+"-"+obj.getLastFourDigit();
	}

}
