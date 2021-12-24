package com.sujata.mapdemos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedHashMap {

	public static void main(String[] args) {
		/*
		 * Collection of key value pair, 
		 * where keys are unique and values can be duplicated
		 * ordered wrt key
		 * autogrowable and autoshrinkable  
		 */
		Map<String, Integer> months=new LinkedHashMap<String, Integer>();

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
