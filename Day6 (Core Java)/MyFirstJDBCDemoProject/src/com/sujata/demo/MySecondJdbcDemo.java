package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySecondJdbcDemo {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Scanner scanner = new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.OracleDriver");

//			1.2 Connect to DB
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");

//			2.Query
			preparedStatement = connection
					.prepareStatement("INSERT INTO EMPLOYEE(ID,NAME,DESIGNATION,DEPARTMENT,SALARY) VALUES(?,?,?,?,?)");
			
			System.out.println("Enter employee ID : ");
			String id = scanner.next();
			System.out.println("Enter Employee Name : ");
			String na = scanner.next();
			System.out.println("Enter Employee Designation : ");
			String desig = scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt = scanner.next();
			System.out.println("Enter Employee Salary : ");
			int sal = scanner.nextInt();

			preparedStatement.setString(1, id);
			preparedStatement.setString(2, na);
			preparedStatement.setString(3, desig);
			preparedStatement.setString(4, deptt);
			preparedStatement.setInt(5, sal);
			
			/*
			 * DML : executeUpdate()
			 */
			int rows=preparedStatement.executeUpdate();

//			3. Process Result
			if(rows>0)
				System.out.println("Employee Record Added");
			else
				System.out.println("Employee Record Insertion Failed");

		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		} catch (SQLException exception) {
			exception.printStackTrace();
		} finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
