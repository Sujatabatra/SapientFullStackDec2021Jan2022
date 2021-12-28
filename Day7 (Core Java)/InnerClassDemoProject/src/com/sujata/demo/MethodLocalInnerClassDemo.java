package com.sujata.demo;

class MyOuter{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	void someMethod() {
		int x=10;
		/*
		 * As My Inner is method Local inner class
		 * so is accessible from method only
		 */
		class MyInner{
			private String name;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
		System.out.println("x : "+x);
		MyInner innerObject=new MyInner();
		innerObject.setName("Sujata");
		System.out.println("name : "+innerObject.name);
	}
	
}
public class MethodLocalInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
