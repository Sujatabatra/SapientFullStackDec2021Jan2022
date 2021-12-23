package com.sujata.training;

public class Grade extends Marks {

	private String grade;
	private double percentage;

	public Grade() {
		//implicit call to base/parent class default constructor
		/*
		 * if parent class don't have default constructor then
		 * we need to give explicit call to base class constructor with super() keyword
		 */
		super(0, 0, 0);
		System.out.println("Hi I am Grade class default constructor");
	}
	public String getGrade() {
		if(getPercentage()>60)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	
	public double getPercentage() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}
	
	public void display() {
		super.display();
		System.out.println("Percetange : "+getPercentage());
		System.out.println("Grade : "+getGrade());
	}
}
