package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyThirdDemoWithThrows {

	public static void fileOpen(String fileName)throws FileNotFoundException {
		
			FileInputStream fis = new FileInputStream(fileName);
			System.out.println("File Opened");
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter File Name : ");
		String fileName = scanner.next();
		try {
			fileOpen(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("file with name "+fileName+" does not exist");
		}

	}

}
