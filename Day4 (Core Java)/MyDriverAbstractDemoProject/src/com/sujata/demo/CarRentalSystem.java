package com.sujata.demo;

public class CarRentalSystem {

	public static void main(String[] args) {
		Audi audi=new Audi("Red", "A8");
		BMW bmw=new BMW("Blue", "Q5");
		Toyota toyota=new Toyota("Golden", "Altis");
		
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		
		sonu.setCar(bmw);
		sonu.drive();

		monu.setCar(audi);
		monu.drive();
	}

}
