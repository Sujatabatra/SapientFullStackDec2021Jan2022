package com.sujata.oop;

/*
 * making data private
 * identify the accessebility of data
 * data to be modifiable : setter
 * data to be readable : getter
 */
/*
 * class : Encapsulation
 * hiding : private
 * abstraction : method
 */
public class Factorial {

	/*
	 * number : setter
	 * factorial : getter
	 */
	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while (number>=1) {
			factorial*=number--;
			
		}
	}
	
	
	
}
