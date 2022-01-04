package com.sujata.model.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sujata.bean.User;
import com.sujata.helper.OracleConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUserByIdAndPassword(String username,String password)throws ClassNotFoundException,SQLException {
		User user=null;

		Connection connection = OracleConnection.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM MYUSER WHERE USERNAME=? and PASSWORD=?");
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			String uname = resultSet.getString("USERNAME");
			String pwd = resultSet.getString("PASSWORD");
			
			user = new User(uname, pwd);

		}

		connection.close();
		return user;

	}

}
