package com.sujata.training;

import com.sujata.oop.Factorial;

/*
 * 1!/1+2!/2+.......n!/n
 */
public class Series {
	
	private int sum,number;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSum() {
		calculateSeries();
		return sum;
	}
	
	private void calculateSeries() {
//		com.sujata.oop.Factorial fOb=new com.sujata.oop.Factorial();
		Factorial fOb=new Factorial();
		for(int count=1;count<=number;count++) {
			fOb.setNumber(count);
			int factorial=fOb.getFactorial();
			System.out.print(factorial+"/"+count+"+");
			sum=sum+factorial/count;
		}
		System.out.println();
	}

}
