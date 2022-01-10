package com.sujata.demo;

public class Contractor extends Employee {

	private int hourlyWage;

	public Contractor(String name, int hourlyWage) {
		super(name);
		this.hourlyWage = hourlyWage;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	@Override
	double weeklyPay(int hoursWorked) {
		if(hoursWorked<=40) {
			return hoursWorked*hourlyWage;
		}
		
		return (hoursWorked-40)*(1.5*hourlyWage)+40*hourlyWage;
	}

}
