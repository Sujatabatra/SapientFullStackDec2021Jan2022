package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		//ClassName ObjectName=new Constructor();
		Complex complex1=new Complex();  //declaration
		
//		complex1.input(10, 5);  //assignment
		complex1.display();
		
		Complex complex2=new Complex(3);
		complex2.display();

		//at the tme of declaration intialization too
		Complex complex3=new Complex(5, 8);
		complex3.display();
	}

}
