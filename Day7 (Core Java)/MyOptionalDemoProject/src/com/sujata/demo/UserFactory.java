package com.sujata.demo;

import java.util.Optional;

public class UserFactory {
	
//	public User getUserObject(String username,String password) {
//		if(username.equals(password)) {
//			return new User(username, password);
//		}
//		return null;
//	}

	public Optional<User> getUserObject(String username,String password) {
		User user=null;
		if(username.equals(password)) {
			user=new User(username,password);
		}
		
		return Optional.ofNullable(user);
	}
}
