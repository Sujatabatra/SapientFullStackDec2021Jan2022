package com.sujata.demo;

import java.util.function.BiFunction;

@FunctionalInterface
interface Shape{
	int area(int length,int breadth);
}

public class MyFirstDemoClass {

	public static void main(String[] args) {
		int i=10;

//		what should be the datatype variable= void test(){
//			System.out.println("hello");
//		}
		
		Shape rectangle=new Shape() {
			@Override
			public int area(int length, int breadth) {
				return length*breadth;
			}
		};
		//lambda
//		Shape rect=(length, breadth)-> length*breadth;
//		System.out.println(rect.area(5, 7));
		
		BiFunction<Integer, Integer, Integer> rect=(length,breadth)->length*breadth;
		System.out.println(rect.apply(5, 7));
		
		
	}

}
