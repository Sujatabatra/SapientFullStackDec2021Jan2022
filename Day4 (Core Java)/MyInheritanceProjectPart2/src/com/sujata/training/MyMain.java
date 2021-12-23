package com.sujata.training;

import com.sujata.demo.SportsMan;
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
		
		System.out.println("===============");
		
		Grade grade=new Grade();
		grade.input(123, "AAAAA", 78, 90, 45);
		grade.display();

		System.out.println("==================");
		SportsMan sportsMan=new SportsMan();
		sportsMan.input(999, "BBBBB","Cricket",5);
		sportsMan.display();
	}

}
