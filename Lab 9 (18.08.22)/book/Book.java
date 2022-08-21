package com.book;
/*
@Author Sankhajit Roy
*/

public class Book {    // class
	
	// took members
	String bookID, title, author, category;
	float price;
	
	// parameterized constructor
	public Book (
			String bookID,
			String title,
			String author,
			String category,
			float price)     
	{
		this.title = title;
		this.author = author;
		
		// try block
		try {
			// operation for book id
			if((bookID.length()==4) && (bookID.charAt(0) == 'B')) {
				this.bookID = bookID;
			}
			else {
				throw new InvalidBookException("Invalid Book ID!");
			}
			
			// operation for book categories
			if (category.equals("Science") || category.equals("Fiction") || category.equals("Technology") || category.equals("Others")) {
				this.category = category;
			}
			else {
				throw new InvalidBookException("Invalid Category!");
			}
			// operation for book price
			if(price>0) {
				this.price = price;
			}
			else {
				throw new InvalidBookException("Invalid Price Input!");
			}
			
			
		// catch block	
		} catch (Exception e) {
			
		}
		
	}
	
}

// create a custom exception class
class InvalidBookException extends Exception{
	String msg;
	InvalidBookException(String str) {
		msg = str;
		System.out.println(msg);
	}
	
}




