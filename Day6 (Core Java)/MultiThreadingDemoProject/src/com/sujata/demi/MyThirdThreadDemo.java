package com.sujata.demi;

class InputValue{
	private int value;
	
	public InputValue(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class LoopClass extends InputValue implements Runnable{
	
	public LoopClass(int number) {
		super(number);
	}
	
	public void display() {
		for(int i=1;i<=getValue();i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

	@Override
	public void run() {
		display();
		
	}
}
public class MyThirdThreadDemo {

	public static void main(String[] args) {
		LoopClass threadJob=new LoopClass(5);
		
		Thread t1=new Thread(threadJob,"FirstThread");
		Thread t2=new Thread(threadJob);
		Thread t3=new Thread(threadJob,"SecondThread");
		Thread t4=new Thread(threadJob);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
