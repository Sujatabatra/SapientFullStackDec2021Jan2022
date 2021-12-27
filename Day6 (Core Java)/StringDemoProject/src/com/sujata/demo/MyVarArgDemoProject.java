package com.sujata.demo;

class Addition{
	
//	public int add(int a,int b) {
//		return a+b;
//	}
//	
//	public int add(int a,int b,int c) {
//		return a+b+c;
//	}
//	public int add(int a,int b,int c,int d) {
//		return a+b+c+d;
//	}
	
	public int add(int ...args) {
		int sum=0;
		for(int arg:args) {
			sum=sum+arg;
		}
		return sum;
	}
}
public class MyVarArgDemoProject {

	public static void main(String[] args) {
		Addition aOb=new Addition();
		System.out.println("Sum of two integers :"+aOb.add(10,20));
		
		System.out.println("Sum of four integers :"+aOb.add(10,20,30,40));
	}
}
