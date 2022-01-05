package com.sujata.service;

public class GoodMorning implements Greet {

	@Override
	public String wish(String name) {
		return "Good Morning "+name+"!";

	}

}
