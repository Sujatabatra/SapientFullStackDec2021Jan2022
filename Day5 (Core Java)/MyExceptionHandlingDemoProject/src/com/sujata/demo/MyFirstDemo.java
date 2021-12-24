package com.sujata.demo;

import java.util.Scanner;

public class MyFirstDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int location=0;
		try {
			System.out.println("Enter First No : ");
			int number1 = scanner.nextInt();
			System.out.println("Enter Second No : ");
			int number2 = scanner.nextInt();

			int divide = number1 / number2;

			System.out.println("Division Result : " + divide);
//			System.exit(0);
			//declaration of an array
			int arr[];
			
			System.out.println("Enter Total No of Elements in an array : ");
			int total=scanner.nextInt();
			
			//allocating memory area
			arr=new int[total];
			
			for(int i=0;i<total;i++) {
				System.out.println("Enter "+(i+1)+" element : ");
				arr[i]=scanner.nextInt();
			}
			
			System.out.println("Enter the location in an array to retreive the value : ");
			location=scanner.nextInt();
			
			System.out.println("Element at "+location+" in an array : "+arr[location]);
			
			System.out.println("Good Bye from Try Block");
		} 
		catch (ArithmeticException exception) {
			System.out.println("Infinity");
		}
		
		catch (NegativeArraySizeException exception) {
			System.out.println("Size of array cannot be negative!");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("location "+location+" does not exist in an array");
		}
//		catch(Exception exception) {
//			System.out.println("Something went wrong , please try again!");
//		}
		finally {
			System.out.println("Hi I am finally block");
		}
		System.out.println("Good Bye from main");

	}

}
