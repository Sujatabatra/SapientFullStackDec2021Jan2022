package com.sujata.demo;

public class MainShapes {

	public static void main(String[] args) {
		NonRoundedShape shape=new Rectangle(7, 9);
		
		shape.area();
		shape.perimeter();
		shape.show();
		
		System.out.println("===============");
		
		shape=new Square(5);
		
		shape.area();
		shape.perimeter();
		shape.show();
		
		System.out.println("====================");
		
		Circle circle=new Circle(7);
		circle.area();
		circle.circumference();
		System.out.println("Area of Circle : "+circle.getArea());
		System.out.println("Circumference of Circle "+circle.getCircumference());
	}
}
