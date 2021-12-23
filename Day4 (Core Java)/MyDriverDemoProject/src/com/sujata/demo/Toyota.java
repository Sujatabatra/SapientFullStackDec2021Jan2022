package com.sujata.demo;

public class Toyota extends Car {

	public Toyota(String color, String model) {
		super(color, model);
	}
	
	@Override
	public void engine() {
		System.out.println("Toyota Engine goes TOOOOOM");
	}

}
