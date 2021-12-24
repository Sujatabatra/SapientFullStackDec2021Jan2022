package com.sujata.demo;

import java.util.Scanner;

public class MainAgeInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age=scanner.nextInt();
		
		AgeInput aOb=new AgeInput();

		try {
			aOb.setAge(age);
			System.out.println("Person is eligible for voting");
		} catch (AgeException e) {
//			e.printStackTrace();
			System.out.println("As person age is "+age+" so not eligible for voting");
		}
		
		aOb.oneMoreSetAge(age);
		
	}

}
