package com.sujata.service;

import com.sujata.bean.Book;

public class ExpensiveBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		return book.getPrice()>1000;
	}

}
