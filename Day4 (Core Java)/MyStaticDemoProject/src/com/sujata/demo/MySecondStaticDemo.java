package com.sujata.demo;

/*
 * static method are getting called before object creation
 * Ques : what all things does my static method will able to access?
 * Ans :the things which are available before object creation.
 * Ques : what all things are available before object creation
 * Ans: static methods or variable
 */
class MySecondStatic{
	private int a;
	private static int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public static int getB() {
		return b;
	}
	public static void setB(int b) {
		MySecondStatic.b = b;
	}
	
}

public class MySecondStaticDemo {

//	void show() {
//		System.out.println("Hi I am show method!");
//	}
	public static void main(String[] args) {
			MySecondStatic.setB(20);
			System.out.println("b : "+MySecondStatic.getB());
//			show();
//			MySecondStaticDemo ob=new MySecondStaticDemo();
//			ob.show();
	}

}
