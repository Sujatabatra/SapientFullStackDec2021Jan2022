package com.sujata.service;

public class GoodEvening implements Greet {

	@Override
	public String wish(String name) {
		return "Good Eveneing "+name+"!";
	}

}
