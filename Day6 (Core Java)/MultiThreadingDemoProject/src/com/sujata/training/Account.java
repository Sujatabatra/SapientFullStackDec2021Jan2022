package com.sujata.training;

public class Account implements Runnable {

	private static int balance = 1000;

	public void withdrawl() {
//		synchronized (Account.class) {
			synchronized (this) {
			if (balance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw , your balance is : Rs." + balance);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - 800;
				System.out
						.println(Thread.currentThread().getName() + " your balance after withdrawl is : Rs." + balance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " insufficient balance to withdraw , your balance is : Rs." + balance);
			}
		}
	}

	public void run() {
		withdrawl();
	}

}
