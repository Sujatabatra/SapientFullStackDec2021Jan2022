package com.sujata.demo;

public class PartTime extends Employee {

	private int hourlyRate;
	public PartTime(String name,int hourlyRate) {
		super(name);
		this.hourlyRate=hourlyRate;
	}

	@Override
	double weeklyPay(int hoursWorked) {
		return hoursWorked*hourlyRate;
	}

}
