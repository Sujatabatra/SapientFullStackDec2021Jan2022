package com.sujata.service;

import com.sujata.bean.Book;

public class AuthorABookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getAuthorName().equals("Author A");
	}

}
