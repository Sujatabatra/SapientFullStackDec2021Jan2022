package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		List<Integer> myList=Arrays.asList(10,12,34,33,90,45,59);
		
		System.out.println("Traversal using streams");
//		myList.stream().forEach(ele->System.out.println(ele));
		
		myList.stream().forEach(System.out::println);
		System.out.println("list of even elements");
		myList.stream()
		.filter(ele->ele%2==0)   //intermediate method
		.forEach(System.out::println);  //terminal method
		
		
		long totalEvenElements=myList.stream()
		.filter(ele->ele%2==0)   //intermediate method
		.count(); //terminal
		
		System.out.println("Total no of even elements in list : "+totalEvenElements);
		
		
		List<Integer> myEvenNoList=myList.stream()
		.filter(ele->ele%2==0)   //intermediate method
		.collect(Collectors.toList());  //terminal
		
		System.out.println(myEvenNoList);
		
		myList.stream()
		.filter(ele->ele%2==0)   //intermediate method
		.limit(2)    //intermediate
		.forEach(System.out::println);  //terminal method
		
		System.out.println("=================");
		
		myList.stream()
		.filter(ele->ele%2==0)   //intermediate method
		.map(ele->ele+4)  ///intermediate method
		.limit(2)    //intermediate
		.forEach(System.out::println);  //terminal method
	}

}
