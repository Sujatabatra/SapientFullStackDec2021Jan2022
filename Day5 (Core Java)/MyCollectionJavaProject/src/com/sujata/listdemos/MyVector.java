package com.sujata.listdemos;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector {

	public static void main(String[] args) {
		/*
		 * ordered collection of duplicate values with indexes
		 * autogrowable and auto shrinkable
		 * internal representation is of Link List
		 * 
		 */
		Vector<Integer> myCollection=new Vector<Integer>();
		
		System.out.println("Size of myCollection "+myCollection.size());
		
		myCollection.add(10);
		myCollection.add(20);
		myCollection.add(2);
		myCollection.add(40);
		myCollection.add(20);
		
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
		for(int element:myCollection) {
			System.out.println(element);
		}
		
		Iterator<Integer> iterator=myCollection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Reverse Traversal using List Iterator");
		ListIterator<Integer> listIterator=myCollection.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
		System.out.println("Travesal using enumeration");
		Enumeration<Integer> enumeration=myCollection.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
