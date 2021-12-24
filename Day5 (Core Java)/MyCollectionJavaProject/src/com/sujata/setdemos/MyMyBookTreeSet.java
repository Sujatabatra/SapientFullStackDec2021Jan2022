package com.sujata.setdemos;

import java.util.TreeSet;

import com.sujata.bean.MyBook;
import com.sujata.bean.MyBookSortByAuthor;
import com.sujata.bean.MyBookSortByPrice;

import java.util.Iterator;
import java.util.Set;

public class MyMyBookTreeSet {

	public static void main(String[] args) {
		
		/*
		 * Ordered Unique collection of Objects 
		 * Collection is auto growable and auto shrinkable
		 */
		Set<MyBook> myCollection=new TreeSet<MyBook>(new MyBookSortByAuthor());
		
		System.out.println("Size of myCollection : "+myCollection.size());
		
		myCollection.add(new MyBook(101, "Book1", "Author A", 1000, 450));
		myCollection.add(new MyBook(102, "Book2", "Author B", 1200, 1450));
		myCollection.add(new MyBook(103, "Book3", "Author Z", 600, 150));
		myCollection.add(new MyBook(104, "Book4", "Author A", 4000, 780));
		myCollection.add(new MyBook(101, "Book1", "Author A", 1000, 450));
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		
		
		System.out.println("Travesal using for each loop");
		for(MyBook element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using iterator");
		//Factory Design Pattern
		Iterator<MyBook> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
