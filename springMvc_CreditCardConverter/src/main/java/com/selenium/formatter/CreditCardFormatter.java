package com.selenium.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.selenium.dto.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	@Override
	public String print(CreditCard object, Locale locale) {

		return object.getFirstFourDigit() + "-" + object.getSecondFourDigit() + "-" + object.getThirdFourDigit() + "-"
				+ object.getLastFourDigit();
	}

	@Override
	public CreditCard parse(String text, Locale locale) throws ParseException {
		CreditCard creditCard = new CreditCard();

		if (text.charAt(4) == '-' && text.charAt(9) == '-' && text.charAt(14) == '-' && text.length() == 19) {

			String[] splittedText = text.split("-");

			creditCard.setFirstFourDigit(Integer.parseInt(splittedText[0]));
			creditCard.setSecondFourDigit(Integer.parseInt(splittedText[1]));
			creditCard.setThirdFourDigit(Integer.parseInt(splittedText[2]));
			creditCard.setLastFourDigit(Integer.parseInt(splittedText[3]));

			return creditCard;

		} else if(text.length() == 16) {
			creditCard.setFirstFourDigit(Integer.parseInt(text.substring(0, 4)));
			creditCard.setSecondFourDigit(Integer.parseInt(text.substring(4, 8)));
			creditCard.setThirdFourDigit(Integer.parseInt(text.substring(8, 12)));
			creditCard.setLastFourDigit(Integer.parseInt(text.substring(12, 16)));

			return creditCard;
			
		}else {
			
			return new CreditCard(1111, 1111, 1111, 1111);

		}

	}

}
