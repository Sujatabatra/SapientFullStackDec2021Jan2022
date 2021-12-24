package com.sujata.demo;

import java.util.Scanner;

public class MySecondDemo {

	static void divide(int no1,int no2) {
		try {
			int result=no1/no2;
			System.out.println("Division Result : "+result);
			System.out.println("Good Bye from try Block");
			return;
		}
		catch(ArithmeticException exception) {
			System.out.println("Infinity");
		}
		finally {
			System.out.println("Hi I am finally Block");
		}
		System.out.println("Good Bye from divide");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First No : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second No : ");
		int number2=scanner.nextInt();
		divide(number1, number2);
		System.out.println("Good Bye from main");
	}
}
