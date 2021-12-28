package com.sujata.demo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sujata.bean.Book;
import com.sujata.datasource.BookList;

public class MySecondDemoClass {

	public static void main(String[] args) {
		List<Book> books=BookList.getBooks();
		System.out.println("List of expensive books");
		books.stream()
		.filter(book->book.getPrice()>1000)
//		.map(book->book.getBookName())
		.map(Book::getBookName)
		.forEach(System.out::println);
		
		System.out.println("Book Names in Sorted order");
//		books.stream()
//		.map(Book::getBookName)
//		.sorted(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//			
//		})
//		.forEach(System.out::println);
		
		books.stream()
		.map(Book::getBookName)
//		.sorted((o1,o2)-> o1.compareTo(o2))
		.sorted(String::compareTo)
		.forEach(System.out::println);

		long totalNoOfAuthors=books.stream()
		.map(Book::getAuthorName)
		.distinct()
		.count();
		
		System.out.println("Total no of authors in our book collection "+totalNoOfAuthors);
		
		System.out.println(books.stream()
		.mapToInt(Book::getPrice)
		.sum());
		
		System.out.println(books.stream().collect(Collectors.summarizingInt(Book::getPrice)));
	}

}
