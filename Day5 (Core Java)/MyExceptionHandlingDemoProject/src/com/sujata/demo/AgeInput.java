package com.sujata.demo;

public class AgeInput {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws AgeException {
		if(age<18)
			throw new AgeException("Age Can't be less than 18");
		this.age = age;
	}
	
	public void oneMoreSetAge(int age) {
		try {
		if(age<18)
			throw new AgeException("Age can't be less than 18");
		this.age=age;
		}
		catch(AgeException ex) {
			System.out.println("Please enter age greater than 18");
		}
		
	}
	
}
