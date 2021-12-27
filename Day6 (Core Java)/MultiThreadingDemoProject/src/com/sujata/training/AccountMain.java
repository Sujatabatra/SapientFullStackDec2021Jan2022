package com.sujata.training;

public class AccountMain {

	public static void main(String[] args) {
		Account a001=new Account();
//		Account a002=new Account();
		Thread chand=new Thread(a001, "Chand Basha");
		Thread ganesh=new Thread(a001,"Ganesh");
		
		chand.start();
		ganesh.start();

	}

}
