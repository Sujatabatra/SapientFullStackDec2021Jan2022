package com.sujata.demo;

public class Square implements NonRoundedShape {

	private int side, area, perimeter;

	public Square(int side) {
		super();
		this.side=side;
	}

	@Override
	public void area() {
		area = side * side;

	}

	@Override
	public void show() {
		System.out.println("Area of Square : " + area);
		System.out.println("Perimeter of Square : " + perimeter);
	}

	@Override
	public void perimeter() {
		perimeter = 4 * side;

	}

}
