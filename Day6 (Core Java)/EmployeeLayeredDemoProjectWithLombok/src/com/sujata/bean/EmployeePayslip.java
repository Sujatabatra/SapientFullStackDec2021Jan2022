package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayslip {

	@Getter
	@Setter
	private Employee employee;
	@Getter
	@Setter
	private double hra;
	@Getter
	@Setter
	private double da;
	@Getter
	@Setter
	private double pf;
	@Getter
	@Setter
	private double total;	
	
}
