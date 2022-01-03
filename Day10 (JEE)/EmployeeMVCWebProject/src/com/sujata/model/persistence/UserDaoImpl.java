package com.sujata.model.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sujata.bean.User;
import com.sujata.helper.OracleConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUserByIdAndPassword(User user)throws ClassNotFoundException,SQLException {
		User user1=null;

		Connection connection = OracleConnection.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM MYUSER WHERE USERNAME=? and PASSWORD=?");
		preparedStatement.setString(1, user.getUsername());
		preparedStatement.setString(2, user.getPassword());

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			String username = resultSet.getString("USERNAME");
			String pwd = resultSet.getString("PASSWORD");
			
			user1 = new User(username, pwd);

		}

		connection.close();
		return user1;

	}

}
