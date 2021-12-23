package com.sujata.training;

import com.sujata.demo.Student;

public class MyMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(111, "ABCD");
		student.display();
		
		System.out.println("===========");
		
		Marks mOb1=new Marks();
		mOb1.input(100, "MNO", 56, 90, 85);
		mOb1.display();

	}

}
