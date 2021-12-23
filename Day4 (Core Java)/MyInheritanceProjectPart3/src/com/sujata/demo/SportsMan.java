package com.sujata.demo;

public class SportsMan extends Student {

	private String sportsName;
	private int score;
	public String getSportsName() {
		return sportsName;
	}
	public int getScore() {
		return score;
	}
	
	public void input(int rollNo,String name,String sportsName,int score) {
		input(rollNo, name);
		this.sportsName=sportsName;
		this.score=score;
	}
	
	public void display() {
		super.display();
		System.out.println(" Sports Name : "+sportsName);
		System.out.println("Sports Score : "+score);
	}
}
