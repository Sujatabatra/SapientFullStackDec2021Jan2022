package com.sujata.demo;

class MyFirstStatic{
	int a;
	static int b;
}
public class MyFirstStaticDemo {

	public static void main(String[] args) {
		MyFirstStatic.b=20;
		System.out.println("b : "+MyFirstStatic.b);
		
		MyFirstStatic ob=null;
		ob=new MyFirstStatic();
		ob.a=10;
		System.out.println("ob.b : "+ob.b);
		System.out.println("ob.a : "+ob.a);
		
//		ob=new MyFirstStatic();

		MyFirstStatic ob1=null;
		ob1=new MyFirstStatic();
		System.out.println("ob1.b : "+ob1.b);
		System.out.println("ob1.a : "+ob1.a);
	}

}
