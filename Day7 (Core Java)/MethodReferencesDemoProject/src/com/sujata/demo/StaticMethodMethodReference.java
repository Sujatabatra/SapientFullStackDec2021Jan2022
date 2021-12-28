package com.sujata.demo;

import java.util.function.Function;

public class StaticMethodMethodReference {

	public static void main(String[] args) {
//		Function<String, Integer> fn=arg->Integer.parseInt(arg);
		Function<String, Integer> fn=Integer::parseInt;
		Integer i=fn.apply("10");
		System.out.println("i : "+i);

	}

}
