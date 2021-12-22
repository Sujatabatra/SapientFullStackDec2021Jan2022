package com.sujata.demo;

//POJO : Plain Old Java Object : a class with private properties and public constructor and setter and getter methods
/*
 * Constructor is used to initialise the object at the time of declaring it
 * 
 * 1. Constructor name is same as that of class name
 * 2. Constructor don't return anything not even void
 * 3. Constructor can be argumented as well as non argumented
 * 4. Constructor can be of any scope (i.e private, public, default)
 * ================================================
 * if the class don't have any constructor, then compiler will create one 
 * no argument constructor(i.e default constructor) for the class and
 * initialise all variables with default initial value ( i.e byte,short,int,long=0
 * float, double=0.0, char=/u0000, boolean=false, object=null)
 */
public class Complex {

	private int real, imagenary;

	/*
	 * constructor Overloading : multiple constructor , but each constructor is
	 * getting differentiated from one another as per its signature signature means
	 * : no and types of arguments and its sequence Polymorphism : Constructor
	 * Overloading
	 */
	/*
	 * contructor with zero argument is known as default constructor
	 */
	public Complex() {
		real = 5;
		imagenary = 20;
	}

	public Complex(int r) {
		real = r;
		imagenary = 10;
	}

	/*
	 * this is the reference variable which holds the reference of current object
	 */
	public Complex(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}

	public void input(int r, int i) {
		real = r;
		imagenary = i;
	}

	public void display() {
		System.out.print(real);
		if (imagenary > 0) {
			System.out.println("+" + imagenary + "i");
		} else if (imagenary < 0) {
			System.out.println(imagenary + "i");
		}
	}

}
