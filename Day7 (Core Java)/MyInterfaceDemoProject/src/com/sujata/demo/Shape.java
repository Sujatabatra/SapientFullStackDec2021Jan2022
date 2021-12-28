package com.sujata.demo;

public interface Shape {

	static void demo() {
		System.out.println("Hi I am demo");
	}
	void area();
	
	default void perimeter() {
		System.out.println("This class is not supporting perimeter");
	}
	
	default void circumference() {
		System.out.println("This class is not supporting circumference");
	}
}
