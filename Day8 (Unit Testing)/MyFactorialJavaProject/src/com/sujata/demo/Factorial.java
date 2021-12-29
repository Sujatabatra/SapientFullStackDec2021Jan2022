package com.sujata.demo;

public class Factorial {
	private int number, factorial;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number < 0)
			throw new NegativeNumberException("Number cann;t be Negative");
		this.number = number;
	}

	public int getFactorial() {
		return factorial;
	}

	public void setFactorial(int factorial) {
		this.factorial = factorial;
	}

	public void calculate() {
		factorial = 1;
		if (number != 0) {
			while (number > 1)
				factorial *= number--;
		}
	}

}
