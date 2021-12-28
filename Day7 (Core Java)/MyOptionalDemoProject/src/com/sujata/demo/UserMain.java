package com.sujata.demo;

import java.util.Optional;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter username ");
		String uname=scanner.next();
		System.out.println("Enter password ");
		String pwd=scanner.next();
		
		UserFactory userFactory=new UserFactory();
		
		Optional<User> optionalUser=userFactory.getUserObject(uname, pwd);
		
		optionalUser.ifPresent(user->user.display());
		
		
		

	}

}
