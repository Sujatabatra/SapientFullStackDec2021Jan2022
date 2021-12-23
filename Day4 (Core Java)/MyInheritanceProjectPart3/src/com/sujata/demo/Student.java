package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;

	public Student() {
		//implicit call to base/parents class default constructor
		System.out.println("Hi I am Student class default Constructor");
	}
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void input(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;

	}

	public void display() {
		System.out.println("Roll No : " + rollNo);
		System.out.println("Name : " + name);

	}

}
