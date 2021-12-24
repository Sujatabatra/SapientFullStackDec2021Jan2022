package com.sujata.mapdemos;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class MyTreeMap {

	public static void main(String[] args) {
		/*
		 * Collection of key value pair, 
		 * where keys are unique and values can be duplicated
		 * sorted wrt key
		 * autogrowable and autoshrinkable  
		 */
		Map<String, Integer> months=new TreeMap<String, Integer>();

		System.out.println("Size of months : "+months.size());
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println("Size of months : "+months.size());
		System.out.println(months);
		
		months.put("Feb", 29);
		
		System.out.println("Size of months : "+months.size());
		System.out.println(months);
		
		Set<String> monthNames=months.keySet();
		for(String month:monthNames) {
			System.out.println(month+" has "+months.get(month)+" days");
		}
		
	}

}
