package com.selenium.editor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class UpperCaseEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		Currency currency = Currency.getInstance(text.toUpperCase());
		
		setValue(currency);
	}

	

	
	
}
