package com.sujata.demi;

class MySecondThread extends Thread{

	public MySecondThread() {
		
	}
	
	public MySecondThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MySecondThreadDemo {

	public static void main(String[] args) {
		
		MySecondThread t1=new MySecondThread();  //New Born -thread0 
		t1.setName("FirstThread");  //rename thread0 with FirstThread
		MySecondThread t2=new MySecondThread("SecondThread");   //
		MySecondThread t3=new MySecondThread();   // - thread1
		MySecondThread t4=new MySecondThread();   // -thread2
		
		
//		t3.setName("ThirdThread");
		t1.start();   //ready or running
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
