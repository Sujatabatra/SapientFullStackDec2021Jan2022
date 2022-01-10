package com.sujata.demo;

public class Regular extends Employee {

	private int annualSalary;

	public Regular(String name, int annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
	}

	@Override
	double weeklyPay(int hoursWorked) {
		return annualSalary/48;
	}

}
