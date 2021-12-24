package com.sujata.setdemos;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class MyTreeSet {

	public static void main(String[] args) {
		
		/*
		 * Ordered Unique collection of Objects 
		 * Collection is auto growable and auto shrinkable
		 */
		Set<Integer> myCollection=new TreeSet<Integer>();
		
		System.out.println("Size of myCollection : "+myCollection.size());
		
		myCollection.add(10);
		myCollection.add(5);
		myCollection.add(500);
		myCollection.add(70);
		myCollection.add(10);
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		
		myCollection.remove(70);
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		
		System.out.println("Travesal using for each loop");
		for(Integer element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using iterator");
		//Factory Design Pattern
		Iterator<Integer> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
