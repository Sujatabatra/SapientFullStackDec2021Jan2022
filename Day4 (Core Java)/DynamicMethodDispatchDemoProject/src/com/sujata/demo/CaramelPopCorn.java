package com.sujata.demo;

public class CaramelPopCorn extends PopCorn {

	@Override
	public void pop() {
		System.out.println("Hot and Sizzling Craamel PopCorn is popping");
	}
	
	public void quantity(int ounce) {
		System.out.println("Adding "+ounce+" ounces of caramel");
	}
}
