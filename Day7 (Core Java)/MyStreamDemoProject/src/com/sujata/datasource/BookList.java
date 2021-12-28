package com.sujata.datasource;

import java.util.ArrayList;
import java.util.List;

import com.sujata.bean.Book;

public class BookList {
	
	private static List<Book> books=new ArrayList<Book>();
	
	static {
		books.add(new Book(101, "Head First Java", "Author A", 750, 1500,"BPB"));
		books.add(new Book(102, "Learn Java in 21 days", "Author Z", 1750, 800,"Tata"));
		books.add(new Book(103, "Spring in Action", "Author A", 890, 1200,"Wiley"));
		books.add(new Book(104, "Mastering in Java", "Author B", 640, 900,"Oxford"));
		books.add(new Book(105, "Java Complete Reference", "Author A", 1980, 1750,"BPB"));
		books.add(new Book(106, "Java in Action", "Author A", 340, 500,"Wiley"));
	}

	public static List<Book> getBooks() {
		return books;
	}

	
}
