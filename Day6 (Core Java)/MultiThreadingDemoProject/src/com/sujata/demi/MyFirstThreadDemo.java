package com.sujata.demi;

class MyFirstThread extends Thread{

	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyFirstThreadDemo {

	public static void main(String[] args) {
		
		MyFirstThread t1=new MyFirstThread();  //New Born - thread0
		t1.setName("FirstThread");
		MyFirstThread t2=new MyFirstThread();   //-thread1
		MyFirstThread t3=new MyFirstThread();   //-thread2
		MyFirstThread t4=new MyFirstThread();   //-thread3
		
		
		t3.setName("ThirdThread");
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
