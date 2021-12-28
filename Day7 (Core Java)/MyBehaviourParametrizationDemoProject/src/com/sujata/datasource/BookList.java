package com.sujata.datasource;

import java.util.ArrayList;
import java.util.List;

import com.sujata.bean.Book;

public class BookList {
	
	private static List<Book> books=new ArrayList<Book>();
	
	static {
		books.add(new Book(101, "Book 1", "Author A", 750, 1500,"BPB"));
		books.add(new Book(102, "Book 2", "Author Z", 1750, 800,"Tata"));
		books.add(new Book(103, "Book 3", "Author A", 890, 1200,"Wiley"));
		books.add(new Book(104, "Book 4", "Author B", 640, 900,"Oxford"));
		books.add(new Book(105, "Book 5", "Author A", 1980, 1750,"BPB"));
		books.add(new Book(106, "Book 6", "Author A", 340, 500,"Wiley"));
	}

	public static List<Book> getBooks() {
		return books;
	}

	
}
