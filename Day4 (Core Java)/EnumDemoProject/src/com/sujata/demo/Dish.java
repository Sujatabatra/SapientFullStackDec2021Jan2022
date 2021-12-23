package com.sujata.demo;

public enum Dish {

	CHICKEN(false,550,890.99),FISH(false,450,1500.80),PANEER(true,480,750.69),DAAL(true,660,350.78),BRINJAL(true,280,250.90);
	
	
	private Dish(boolean vegetarian, int calorie, double price) {
		this.vegetarian = vegetarian;
		this.calorie = calorie;
		this.price = price;
	}
	private boolean vegetarian;
	private int calorie;
	private double price;
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	public int getCalorie() {
		return calorie;
	}
	public double getPrice() {
		return price;
	}
	
}
