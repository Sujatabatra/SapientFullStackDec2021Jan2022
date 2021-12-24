package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.generics.Person;

public class MyPersonHashSet {

	public static void main(String[] args) {
		
		/*
		 * Unordered Unique collection of Objects 
		 * Collection is auto growable and auto shrinkable
		 */
		Set<Person> myCollection=new HashSet<Person>();
		
		System.out.println("Size of myCollection : "+myCollection.size());
		
		myCollection.add(new Person(101, "AAAA"));
		myCollection.add(new Person(102, "BBBB"));
		myCollection.add(new Person(103, "CCCC"));
		myCollection.add(new Person(104, "DDDD"));
		myCollection.add(new Person(101, "AAAA"));
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		
				
		System.out.println("Travesal using for each loop");
		for(Person element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using iterator");
		//Factory Design Pattern
		Iterator<Person> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
