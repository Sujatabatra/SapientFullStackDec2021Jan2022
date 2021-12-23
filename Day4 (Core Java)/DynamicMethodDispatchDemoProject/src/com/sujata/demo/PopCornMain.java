package com.sujata.demo;

public class PopCornMain {

	public static void main(String[] args) {
		/*
		 * Dynamic Method Dispatch : Base class Reference Type is Type Compatible with
		 * derived class, but reverse is not true
		 * 
		 * Polymorphism : overriding (Run Time Polymorphism) - Late Binding
		 * Polymophism : overloading (Compile Time Polymorphism) - Early Binding
		 */
		
		PopCorn p1;  //Base class Reference Variable
		
		p1=new CaramelPopCorn();
		p1.pop();
//		p1.quantity(); coz of object slicing can't call quantity
		
		p1=new ButterPopCorn();
		p1.pop();

	}

}
