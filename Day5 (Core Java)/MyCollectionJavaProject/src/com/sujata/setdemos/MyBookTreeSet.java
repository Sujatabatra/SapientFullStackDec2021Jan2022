package com.sujata.setdemos;

import java.util.TreeSet;

import com.sujata.bean.Book;

import java.util.Iterator;
import java.util.Set;

public class MyBookTreeSet {

	public static void main(String[] args) {
		
		/*
		 * Ordered Unique collection of Objects 
		 * Collection is auto growable and auto shrinkable
		 */
		Set<Book> myCollection=new TreeSet<Book>();
		
		System.out.println("Size of myCollection : "+myCollection.size());
		
		myCollection.add(new Book(101, "Book1", "Author A", 1000, 450));
		myCollection.add(new Book(102, "Book2", "Author B", 1200, 1450));
		myCollection.add(new Book(103, "Book3", "Author ", 600, 150));
		myCollection.add(new Book(104, "Book4", "Author A", 4000, 780));
		myCollection.add(new Book(101, "Book1", "Author A", 1000, 450));
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		
		
		System.out.println("Travesal using for each loop");
		for(Book element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using iterator");
		//Factory Design Pattern
		Iterator<Book> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
