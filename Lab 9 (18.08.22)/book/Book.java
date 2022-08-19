package com.book;
/*
@Author Sankhajit Roy
*/

public class Book {    // class
	
	// took members
	String bookID, title, author, category;
	float price;
	
	public Book (
			String bookID,
			String title,
			String author,
			String category,
			float price)     // parameterized constructor
	{
		this.title = title;
		this.author = author;
		
		// try block
		try {
			// operation for book categories
			if (category.equals("Science") || category.equals("Fiction") || category.equals("Technology") || category.equals("Others")) {
				this.category = category;
			}
			else {
				throw new InvalidBookException();
			}
			// operation for book price
			if(price>0) {
				this.price = price;
			}
			else {
				throw new InvalidBookException();
			}
			
			// operation for book id
			if((bookID.length()==4) && (bookID.charAt(0) == 'B')) {
				this.bookID = bookID;
			}
			else {
				throw new InvalidBookException();
			}
			
		// catch block	
		} catch (Exception e) {
			
		}
		
	}
	
}
// create a custom exception class
class InvalidBookException extends Exception{
	
}




