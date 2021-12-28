package com.sujata.demo;

interface Shape{
	public void area();
}
class PopCorn{
	public void pop() {
		System.out.println("PopCorn is Popping!");
	}
}

class ButterPopCorn extends PopCorn{
	public void pop() {
		System.out.println("Hot and Sizzling Butter PopCorn is Popping");
	}
}
public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		PopCorn caramelPopcorn=new PopCorn() {
			public void pop() {
				System.out.println("Caramel PopCorn is popping");
			}
		};
		
		caramelPopcorn.pop();

		Shape shape1=new Shape() {
			@Override
			public void area() {
				System.out.println("Hi I am area of Shape");
				
			}
		};
		
		shape1.area();
	}

}
