package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

	@Getter
	@Setter
	private int bookId;
	@Getter
	@Setter
	private String bookName;
	@Getter
	@Setter
	private String authorName;
	@Getter
	@Setter
	private int price;
	@Getter
	@Setter
	private int noOfPages;
}
