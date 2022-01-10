package com.sujata.demo;

public class Manager extends Regular {

	private int bonus;

	public Manager(String name, int annualSalary, int bonus) {
		super(name, annualSalary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	double weeklyPay(int hoursWorked) {
		return super.weeklyPay(hoursWorked)+bonus;
	}
}
