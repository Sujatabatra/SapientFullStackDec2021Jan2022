package com.sujata.training;

public class Grade extends Marks {

	private String grade;
	private double percentage;
	
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
