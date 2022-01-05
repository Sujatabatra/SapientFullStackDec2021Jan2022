package com.sujata.service;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee getEmployeeById(String id) throws ClassNotFoundException, SQLException {
		return employeeDao.getRecordById(id);
	}

	@Override
	public boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		int rows=employeeDao.saveRecord(employee);
		if(rows>0)
			return true;
		return false;
	}

	/*
	 * Hra=18% of salary
	 * Da=15% of salary
	 * pf=12% of Salary
	 */
	@Override
	public EmployeePayslip generatePayslip(String employeeId) throws ClassNotFoundException, SQLException {
		
		Employee employee=employeeDao.getRecordById(employeeId);
		
		EmployeePayslip employeePayslip=null;
		if(employee!=null) {
			double hra=employee.getSalary()*.18;
			double da=employee.getSalary()*.15;
			double pf=employee.getSalary()*.12;
			double totalSalary=employee.getSalary()+hra+da-pf;
			employeePayslip=new EmployeePayslip(employee, hra, da, pf, totalSalary);
		}
		return employeePayslip;
	}

	@Override
	public boolean deleteEmployee(String employeeId) throws ClassNotFoundException, SQLException {
		int rows=employeeDao.deleteRecord(employeeId);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateEmployee(String employeeId, int employeeSalary) throws ClassNotFoundException, SQLException {
		int rows=employeeDao.updateRecord(employeeId, employeeSalary);
		if(rows>0)
			return true;
		return false;
	}

}
