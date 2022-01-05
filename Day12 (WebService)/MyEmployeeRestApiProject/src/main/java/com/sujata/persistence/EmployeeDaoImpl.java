package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.helper.OracleConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllRecords() throws ClassNotFoundException, SQLException {

		List<Employee> employeeList = new ArrayList<Employee>();

		
		Connection connection = OracleConnection.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			String id = resultSet.getString("ID");
			String na = resultSet.getString("NAME");
			String desig = resultSet.getString("DESIGNATION");
			String deptt = resultSet.getString("DEPARTMENT");
			int sal = resultSet.getInt("SALARY");
			
			Employee employee=new Employee(id, na, desig, deptt, sal);
			employeeList.add(employee);
		}

		connection.close();

		return employeeList;
	}

	@Override
	public Employee getRecordById(String id) throws ClassNotFoundException, SQLException {
		Employee employee=null;
		
		Connection connection = OracleConnection.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID=?");
		preparedStatement.setString(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			String eid = resultSet.getString("ID");
			String na = resultSet.getString("NAME");
			String desig = resultSet.getString("DESIGNATION");
			String deptt = resultSet.getString("DEPARTMENT");
			int sal = resultSet.getInt("SALARY");
			
			employee=new Employee(eid, na, desig, deptt, sal);
		
		}

		connection.close();
		return employee;
	}

	@Override
	public int saveRecord(Employee employee) throws ClassNotFoundException, SQLException {

		Connection connection = OracleConnection.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO EMPLOYEE(ID,NAME,DESIGNATION,DEPARTMENT,SALARY) VALUES(?,?,?,?,?)");
		
		
		preparedStatement.setString(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getDesignation());
		preparedStatement.setString(4, employee.getDepartment());
		preparedStatement.setInt(5, employee.getSalary());
		
		int rows=preparedStatement.executeUpdate();

		return rows;
	}

	@Override
	public int deleteRecord(String employeeId) throws ClassNotFoundException, SQLException {
		Connection connection = OracleConnection.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
		
		preparedStatement.setString(1, employeeId);
		
		int rows=preparedStatement.executeUpdate();

		return rows;
	}

	@Override
	public int updateRecord(String employeeId, int employeeSalary) throws ClassNotFoundException, SQLException {
		Connection connection = OracleConnection.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("UPDATE EMPLOYEE SET SALARY=? WHERE ID=?");
		
		preparedStatement.setInt(1, employeeSalary);
		preparedStatement.setString(2, employeeId);
		
		int rows=preparedStatement.executeUpdate();

		return rows;
	}

}
