package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyThirdDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter File Name : ");
		String fileName=scanner.next();

		try {
			FileInputStream fis=new FileInputStream(fileName);
			System.out.println("File Opened");
		} 
		catch (FileNotFoundException e) {
			System.out.println("file "+fileName+" does not exist!");
		}
		
	}

}
