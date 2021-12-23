package com.sujata.demo;

//Sujata
/*
 * if there is even a single abstract method in a class,
 * then its mandatory for the class as well to be abstract
 * 
 * marking the class abstract mean , 
 * telling the java environment that we don't have complete functionality which is required for the system,
 * some functionality is concrete and some is abstract, 
 * and abstract fulfillment will be done by child classes
 */
abstract public class Car {

	private String color, model;

	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	/*
	 * contract, which child class is supposed to fulfill that is why it don't have
	 * any body , just declaration
	 */
	abstract public void engine();

}
