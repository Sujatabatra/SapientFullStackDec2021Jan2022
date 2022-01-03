package com.sujata.model.persistence;

import java.sql.SQLException;

import com.sujata.bean.User;

public interface UserDao {
	
	public User getUserByIdAndPassword(User user)throws ClassNotFoundException,SQLException ;

}
