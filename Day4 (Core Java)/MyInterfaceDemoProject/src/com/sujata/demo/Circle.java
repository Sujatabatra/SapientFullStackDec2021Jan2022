package com.sujata.demo;

public class Circle extends ValueInput implements Shape, RoundedShape {

	private double area,circumference;
	
	public Circle(int radius) {
		setValue(radius);
	}
	
	@Override
	public void circumference() {
		circumference=2*PI*getValue();
	}

	@Override
	public void area() {
		area=PI*getValue()*getValue();

	}

	public double getArea() {
		return area;
	}

	
	public double getCircumference() {
		return circumference;
	}

	
}
