package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyThirdDemoClass {

	public static void main(String[] args) {
		List<Integer> myList=Arrays.asList(1,2,3,4,5,6,7,8);
		
		Integer sum=myList.stream()
		.reduce(0, (n1,n2)->n1+n2);
		
		System.out.println("Sum = "+sum);
		
		System.out.println(myList.stream().count());
		System.out.println(myList.stream().collect(Collectors.counting()));
		
	}
}
