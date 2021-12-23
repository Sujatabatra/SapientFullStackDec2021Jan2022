package com.sujata.demo;

public class MyMainEnumClass {

	public static void main(String[] args) {
		Dish dish1=Dish.CHICKEN;
		System.out.println(" Is Dish Vegetarian : "+dish1.isVegetarian());
		System.out.println("Calorie count of the dish : "+dish1.getCalorie());
		System.out.println("Price of Dish : "+dish1.getPrice());

	}

}
