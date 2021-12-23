package com.sujata.demo;


class MyThirdStatic{
	static{
		System.out.println("Hi I am static Block!");
	}
	public MyThirdStatic() {
		System.out.println("Hi I am constructor of MyThirdStatic Class");
	}
	
	{
		System.out.println("Hi I am instance Block");
	}
}

class Derived extends MyThirdStatic{
	static{
		System.out.println("Hi I am static Block from derived!");
	}
	public Derived() {
		System.out.println("Hi I am constructor of Derived Class");
	}
	
	{
		System.out.println("Hi I am instance Block Derived");
	}
}
public class MyThirdStaticDemo {
	public static void main(String[] args) {
		
//		MyThirdStatic ob1=new MyThirdStatic();
//		
		
		MyThirdStatic ob2=new MyThirdStatic();
		
		Derived d=new Derived();
		/*
		 * 1. static block of MyThirdStatic(this will not be executed)
		 * 2. static block of derived
		 * 3.instance block of MyThirdstatic
		 * 4. constructor of MyThird Static
		 * 5. instance of Derived
		 * 6. Constructor of Derived
		 */
		
		

	}

}
