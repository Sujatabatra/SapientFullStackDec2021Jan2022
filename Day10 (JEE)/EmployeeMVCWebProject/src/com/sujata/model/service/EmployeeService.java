package com.sujata.model.service;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;

public interface EmployeeService {
	List<Employee> getAllEmployee()throws ClassNotFoundException,SQLException;
	public Employee getEmployeeById(String id) throws ClassNotFoundException, SQLException;
	public boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException;
	public EmployeePayslip generatePayslip(String employeeId)throws ClassNotFoundException, SQLException;
	boolean deleteEmployee(String employeeId)throws ClassNotFoundException,SQLException;
	boolean updateEmployee(String employeeId,int employeeSalary)throws ClassNotFoundException,SQLException;
}
