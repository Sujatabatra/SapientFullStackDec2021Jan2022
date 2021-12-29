package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class MyCalculator {

	/*
	 * Requirement : divide two positive nos.
	 */
	public int divide(int number1,int number2)throws NegativeNumberException {
		if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNumberException("Negative No Not Allowed");
	}
	
	public int add(int number1,int number2)throws NegativeNumberException {
		if(number1>=0 && number2>=0)
			return number1+number2;
		else
			throw new NegativeNumberException("Negative No Not Allowed");
	}
	
}
