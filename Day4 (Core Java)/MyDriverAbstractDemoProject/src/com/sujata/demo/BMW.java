package com.sujata.demo;

//Avinash
public class BMW extends Car {

	public BMW(String color, String model) {
		super(color, model);
	}
	
	
	public void bmwEngine() {
		System.out.println("BMW Engine goes BOOOOOM");
	}


	@Override
	public void engine() {
		bmwEngine();
		
	}

}
