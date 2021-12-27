package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MyThirdJdbcDemo {

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
					.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
			
			System.out.println("Enter employee ID whose record you want to delete: ");
			String id = scanner.next();

			preparedStatement.setString(1, id);
			
			/*
			 * DML : executeUpdate()
			 */
			int rows=preparedStatement.executeUpdate();

//			3. Process Result
			if(rows>0)
				System.out.println("Employee Record Deleted");
			else
				System.out.println("Employee Record Deletion Failed");

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
