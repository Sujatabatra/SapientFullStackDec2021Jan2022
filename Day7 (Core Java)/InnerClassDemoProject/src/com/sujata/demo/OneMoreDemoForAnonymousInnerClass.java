package com.sujata.demo;

public class OneMoreDemoForAnonymousInnerClass {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello from "+Thread.currentThread().getName());
			}
		},"MyThread");
		t1.start();

	}

}
