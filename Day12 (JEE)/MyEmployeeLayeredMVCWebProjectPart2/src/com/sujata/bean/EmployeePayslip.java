package com.sujata.bean;

public class EmployeePayslip {

	private Employee employee;
	private double hra;
	private double da;
	private double pf;
	private double total;
	
	public EmployeePayslip() {
		
	}

	public EmployeePayslip(Employee employee, double hra, double da, double pf, double total) {
		super();
		this.employee = employee;
		this.hra = hra;
		this.da = da;
		this.pf = pf;
		this.total = total;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "EmployeePayslip [employee=" + employee + ", hra=" + hra + ", da=" + da + ", pf=" + pf + ", total="
				+ total + "]";
	}
	
	
}
