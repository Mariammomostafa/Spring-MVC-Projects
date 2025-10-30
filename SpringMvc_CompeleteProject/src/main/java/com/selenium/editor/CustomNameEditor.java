package com.selenium.editor;

import java.beans.PropertyEditorSupport;

public class CustomNameEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
	
		String upperCaseText = text.toUpperCase();
		setValue(upperCaseText);
	}

	
	
}
