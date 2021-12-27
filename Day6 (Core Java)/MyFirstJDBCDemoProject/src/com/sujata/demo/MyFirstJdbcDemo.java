package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstJdbcDemo {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.OracleDriver");
			
//			1.2 Connect to DB
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");
			
//			2.Query
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			/*
			 * DQL : executeQuery()
			 */
			ResultSet resultSet= preparedStatement.executeQuery();
			
//			3. Process Result
			while(resultSet.next()) {
				String id=resultSet.getString("ID");
				String na=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				int sal=resultSet.getInt("SALARY");
				
				System.out.println(id+"  "+na+"  "+desig+"  "+deptt+"  "+sal);
			}
		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
