package com.selenium.dto;

public class CreditCard {
	
	private int firstFourDigit;
	
	private int secondFourDigit;

	
	private int thirdFourDigit;

	
	private int lastFourDigit;


	public CreditCard() {
		super();
	}


	public CreditCard(int firstFourDigit, int secondFourDigit, int thirdFourDigit, int lastFourDigit) {
		super();
		this.firstFourDigit = firstFourDigit;
		this.secondFourDigit = secondFourDigit;
		this.thirdFourDigit = thirdFourDigit;
		this.lastFourDigit = lastFourDigit;
	}


	public int getFirstFourDigit() {
		return firstFourDigit;
	}


	public void setFirstFourDigit(int firstFourDigit) {
		this.firstFourDigit = firstFourDigit;
	}


	public int getSecondFourDigit() {
		return secondFourDigit;
	}


	public void setSecondFourDigit(int secondFourDigit) {
		this.secondFourDigit = secondFourDigit;
	}


	public int getThirdFourDigit() {
		return thirdFourDigit;
	}


	public void setThirdFourDigit(int thirdFourDigit) {
		this.thirdFourDigit = thirdFourDigit;
	}


	public int getLastFourDigit() {
		return lastFourDigit;
	}


	public void setLastFourDigit(int lastFourDigit) {
		this.lastFourDigit = lastFourDigit;
	}


	


}
