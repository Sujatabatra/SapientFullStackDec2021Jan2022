package com.sujata.demo;

public class FoodCourt {
	
	private PopCorn popcorn;

	public void setPopcorn(PopCorn p) {
		this.popcorn = p;
	}
	
	void buy() {
		popcorn.pop();
	}
	

}
