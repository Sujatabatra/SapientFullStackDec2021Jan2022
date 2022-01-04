package com.sujata.model.persistence;

import java.sql.SQLException;
import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	List<Employee> getAllRecords()throws ClassNotFoundException,SQLException;
	Employee getRecordById(String id)throws ClassNotFoundException,SQLException;
	int saveRecord(Employee employee)throws ClassNotFoundException,SQLException;
	int deleteRecord(String employeeId)throws ClassNotFoundException,SQLException;
	int updateRecord(String employeeId,int employeeSalary)throws ClassNotFoundException,SQLException;
}
