package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	@Getter
	@Setter
	private String empId;
	@Getter
	@Setter
	private String empName;
	@Getter
	@Setter
	private String designation;
	@Getter
	@Setter
	private String department;
	@Getter
	@Setter
	private int salary;
	
	
}
