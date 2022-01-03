package com.sujata.model.service;

import java.sql.SQLException;

import com.sujata.bean.User;

public interface UserService {

	public boolean userCheck(User user)throws ClassNotFoundException,SQLException;
}
