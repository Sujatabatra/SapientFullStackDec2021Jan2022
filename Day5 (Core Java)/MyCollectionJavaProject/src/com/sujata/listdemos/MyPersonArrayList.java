package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sujata.generics.Person;

public class MyPersonArrayList {

	public static void main(String[] args) {
		/*
		 * ordered collection of duplicate values with indexes
		 * autogrowable and auto shrinkable
		 * internal representation is of Array
		 * 
		 */
		List<Person> myCollection=new ArrayList<Person>();
		
		System.out.println("Size of myCollection "+myCollection.size());
		
		myCollection.add(new Person(101, "AAAA"));
		myCollection.add(new Person(102, "BBBB"));
		myCollection.add(new Person(103, "CCCC"));
		myCollection.add(new Person(104, "DDDD"));
		myCollection.add(new Person(105, "EEEE"));
		
		System.out.println("Size of myCollection "+myCollection.size());
		System.out.println(myCollection);
		
		myCollection.remove(3);
		
		System.out.println("Size of myCollection "+myCollection.size());
		System.out.println(myCollection);
		
		System.out.println("Traversal Using traditional for loop ");
		for(int index=0;index<myCollection.size();index++) {
			System.out.println(myCollection.get(index));
		}
		
		System.out.println("Traversal using for each");
		for(Person element:myCollection) {
			System.out.println(element);
		}
		System.out.println("Traversal using Iterator");
		Iterator<Person> iterator=myCollection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Reverse Traversal using List Iterator");
		ListIterator<Person> listIterator=myCollection.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}

}
