package com.sujata.modular;

/*
 * ignore static for current program, 
 * as we are trying to mimic modular behaviour from OOP language
 */
public class MyModularProgrammingDemo {

	static int number, factorial;

	static void input(int n) {
		number=n;
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	static void display() {
		System.out.println("Factorial : "+factorial);
	}
	
	public static void main(String[] args) {
		input(4);
		calculateFactorial();
		//logical error
		factorial=6;
		display();

	}

}
