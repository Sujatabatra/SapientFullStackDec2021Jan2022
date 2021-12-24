package com.sujata.bean;

import java.util.Comparator;

public class MyBookSortByPrice implements Comparator<MyBook> {

	@Override
	public int compare(MyBook o1, MyBook o2) {
		if(o1.getPrice()>o2.getPrice())
			return 1;
		else if(o1.getPrice()<o2.getPrice())
			return -1;
		return 0;
	}

}
