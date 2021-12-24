package com.sujata.bean;

import java.util.Comparator;

public class MyBookSortByAuthor implements Comparator<MyBook> {

	@Override
	public int compare(MyBook o1, MyBook o2) {
		
		return o1.getAuthorName().compareTo(o2.getAuthorName());
	}

}
