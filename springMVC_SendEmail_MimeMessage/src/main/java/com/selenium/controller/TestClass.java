package com.selenium.controller;

import java.io.File;

public class TestClass {

	public static void main(String[] args) {
		
		//how to exreact the location of file which exists in static folder
		
	    File attachmentFile = new File("static/sea.jpeg");
	    System.out.println("Attempting to attach file: " + attachmentFile.getAbsolutePath());
	    
	 }

}
