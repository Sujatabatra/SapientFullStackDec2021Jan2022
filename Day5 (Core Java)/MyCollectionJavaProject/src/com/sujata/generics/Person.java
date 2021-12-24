package com.sujata.generics;

public class Person {

	private int pId;
	private String pName;
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
}
