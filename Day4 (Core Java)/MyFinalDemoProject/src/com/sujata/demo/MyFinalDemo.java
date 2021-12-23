package com.sujata.demo;

final class Base{
	final private int value=10;
	private String name;
	
	public void change() {
//		value=15;
		name="Sujata";
	}
	
	public final void show() {
		System.out.println(" value : "+value);
		System.out.println(" name : "+name);
	}
	
	public  void display() {
		System.out.println("Hi I am display method from base class");
	}
	
}

class Derived extends Base{
	
	@Override
	public  void display() {
		System.out.println("Hi I am display method from Derived class");
	}
	
//	public void show() {
//		
//	}
}
public class MyFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
