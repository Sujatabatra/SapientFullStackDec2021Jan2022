package com.sujata.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sujata.bean.Book;

public class BookSearchService {

	public List<Book> searchBooksByAuthor(List<Book> books,String authorName){
		List<Book> bookList=new ArrayList();
		for(Book book:books) {
			if(book.getAuthorName().equals(authorName))
				bookList.add(book);
		}
		return bookList;
	}
	
	public List<Book> searchExpensiveBooks(List<Book> books){
		List<Book> bookList=new ArrayList();
		for(Book book:books) {
			if(book.getPrice()>1000)
				bookList.add(book);
		}
		return bookList;
	}
	
	public List<Book> searchBooks(List<Book> books,BookPredicate bookPredicate){
//		List<Book> bookList=new ArrayList();
//		for(Book book:books) {
//			if(bookpredicate.test(book))
//				bookList.add(book);
//		}
//		return bookList;
		
		List<Book> bookList=books.stream()
		.filter(bookPredicate::test)
		.collect(Collectors.toList());
		
		return bookList;
	}
}
