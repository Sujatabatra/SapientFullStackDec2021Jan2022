package com.sujata.demo;

class Outer{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	class Inner{
		private int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		public void display() {
			System.out.println("Value : "+value);
			System.out.println("name : "+name);
		}
	}
	
	public void show() {
		System.out.println("name : "+name);
//		System.out.println("value : "+value);
	}
}
public class MyInnerClassDemo {

	public static void main(String[] args) {
		Outer outerObject=new Outer();
		outerObject.setName("Sujata");
		outerObject.show();
		
		Outer.Inner innerObj=outerObject.new Inner();
		
		innerObj.setValue(10);
		innerObj.display();

	}

}
