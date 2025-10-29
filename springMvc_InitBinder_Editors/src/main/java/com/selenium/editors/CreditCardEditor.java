package com.selenium.editors;

import java.beans.PropertyEditorSupport;

import com.selenium.dto.CreditCard;

public class CreditCardEditor extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		
		CreditCard object = (CreditCard) getValue();

		return "sample : "+ object.getFirstFourDigit()+"-"+object.getSecondFourDigit()
		                  +"-"+object.getThirdFourDigit()+"-"+object.getLastFourDigit();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		
		System.out.println(text);
		
		CreditCard creditCard = new CreditCard();

		if (text.charAt(4) == '-' && text.charAt(9) == '-' && text.charAt(14) == '-' && text.length() == 19) {

			String[] splittedText = text.split("-");

			creditCard.setFirstFourDigit(Integer.parseInt(splittedText[0]));
			creditCard.setSecondFourDigit(Integer.parseInt(splittedText[1]));
			creditCard.setThirdFourDigit(Integer.parseInt(splittedText[2]));
			creditCard.setLastFourDigit(Integer.parseInt(splittedText[3]));

			setValue(creditCard);

		
		} else if(text.length() == 16) {
			creditCard.setFirstFourDigit(Integer.parseInt(text.substring(0, 4)));
			creditCard.setSecondFourDigit(Integer.parseInt(text.substring(4, 8)));
			creditCard.setThirdFourDigit(Integer.parseInt(text.substring(8, 12)));
			creditCard.setLastFourDigit(Integer.parseInt(text.substring(12, 16)));

			System.out.println(creditCard);
			setValue(creditCard);			
		}else {
			
			setValue(new CreditCard(1111, 1111, 1111, 1111));		
		}

	}

	
	
}
