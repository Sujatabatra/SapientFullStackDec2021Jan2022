package com.sujata.model.service;

public class Factorial {
	private int number, factorial;
	
	public Factorial() {

	}
	public Factorial(int number) {
		super();
		this.number = number;
	}

	public int getFactorial() {
		factorial=1;
		int number1=number;
		while(number1>=1) {
			factorial*=number1--;
		}
		return factorial;
	}
	public int getNumber() {
		return number;
	}
	
	

}
