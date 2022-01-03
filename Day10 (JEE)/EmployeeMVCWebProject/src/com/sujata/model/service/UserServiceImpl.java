package com.sujata.model.service;

import java.sql.SQLException;

import com.sujata.bean.User;
import com.sujata.model.persistence.UserDao;
import com.sujata.model.persistence.UserDaoImpl;

public class UserServiceImpl implements UserService{

	private UserDao userDao=new UserDaoImpl();
	
	@Override
	public boolean userCheck(User user) throws ClassNotFoundException, SQLException {
		User us=userDao.getUserByIdAndPassword(user);
		if(us!=null)
			return true;
		return false;
	}

}
