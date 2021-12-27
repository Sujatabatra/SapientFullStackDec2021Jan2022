package com.sujata.demo;

public class DemoClass {

	public static void main(String[] args) {
		String firstName="Sujata";
		
		String fullName=firstName.concat(" Batra");
		System.out.println("Full Name : "+fullName);
		
		StringBuilder str=new StringBuilder("Sujata");
		str.append(" Batra");
		System.out.println("str : "+str);
	}

}
