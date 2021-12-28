package com.sujata.demo;

import java.util.List;

import com.sujata.bean.Book;
import com.sujata.datasource.BookList;
import com.sujata.service.AuthorABookPredicate;
import com.sujata.service.BookPredicate;
import com.sujata.service.BookSearchService;
import com.sujata.service.ExpensiveBookPredicate;

public class BookMain {

	public static void main(String[] args) {
		List<Book> books = BookList.getBooks();
		System.out.println(books);

		BookSearchService bookSearchService = new BookSearchService();
		System.out.println("List of Books written by Author A");
		List<Book> bookList = bookSearchService.searchBooksByAuthor(books, "Author A");
		System.out.println(bookList);

		System.out.println("List of Expensive Books ");
		List<Book> bookList1 = bookSearchService.searchExpensiveBooks(books);
		System.out.println(bookList1);

		System.out.println("List of Books written by Author A");
		List<Book> bookList2 = bookSearchService.searchBooks(books, new AuthorABookPredicate());
		System.out.println(bookList2);

		System.out.println("List of Expensive Books ");
		List<Book> bookList3 = bookSearchService.searchBooks(books, new ExpensiveBookPredicate());
		System.out.println(bookList3);

		System.out.println("List of Thick Books ");
//		List<Book> bookList4=bookSearchService.searchBooks(books, new BookPredicate() {
//			
//			@Override
//			public boolean test(Book book) {
//				return book.getNoOfPages()>1500;
//			}
//		});
		List<Book> bookList4 = bookSearchService.searchBooks(books,(book)-> book.getNoOfPages() > 1500);

		System.out.println(bookList4);

		System.out.println("List of Books Published By BPB");
		List<Book> bookList5 = bookSearchService.searchBooks(books, new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getPublisher().equals("BPB");
			}
		});
		System.out.println(bookList5);

	}

}
