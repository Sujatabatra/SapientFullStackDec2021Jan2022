package com.sujata.demo;

public class Shape {

	/*
	 * Method Overloading :
	 * Multiple methods have one name but different signatures
	 * signature : no and type of arguments and their sequence
	 * Polymorphism : Method Overloading
	 */
	public void area(int l,int b) {
		int area=l*b;
		System.out.println("Area of Rectangle : "+area);
	}
	
	public void area(double radius) {
		double area=3.142*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
	
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of Square : "+area);
	}
}
