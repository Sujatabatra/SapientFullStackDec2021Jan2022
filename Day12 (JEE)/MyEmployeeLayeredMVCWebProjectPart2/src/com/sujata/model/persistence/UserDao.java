package com.sujata.model.persistence;

import java.sql.SQLException;

import com.sujata.bean.User;

public interface UserDao {
	
	public User getUserByIdAndPassword(String username,String password)throws ClassNotFoundException,SQLException ;

}
