package com.sujata.demo;

abstract public class Employee {
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract double weeklyPay(int hoursWorked);

}
