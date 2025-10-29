package com.selenium.editors;

import java.beans.PropertyEditorSupport;

public class UpperCaseEditors extends PropertyEditorSupport{

	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String upperCasedText = text.toUpperCase();
		setValue(upperCasedText);
	}

	
	
}
