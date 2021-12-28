package com.sujata.demo;

import java.util.function.Consumer;

interface Demo{
	void test();
}

interface Greet{
	void wish(String name);
}
public class MySecondDemoClass {
	public static void main(String[] args) {
		Demo d=()->System.out.println("hello Everyone");
		d.test();
		
//		Greet goodMrng=new Greet() {
//			@Override
//			public void wish(String name) {
//				System.out.println("Good Morning "+name);
//				
//			}
//		};
		
//		Greet goodMrng=name-> System.out.println("Good Morning "+name);
//		goodMrng.wish("Suhel");
		
		Consumer<String> goodMrng=name->System.out.println("Good Morning "+name);
		goodMrng.accept("Suhel");
		
	}
}
