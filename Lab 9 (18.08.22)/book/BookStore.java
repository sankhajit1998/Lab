package com.book;
/*
@Author Sankhajit Roy 
*/

import java.util.ArrayList;

public class BookStore {     // class 
	// created a ArrayList object
	ArrayList<Book> book = new ArrayList<>();
	
	// method to add books
	public void addBook(Book b) {    
		book.add(b);
	}
	
	// method to search book by title
	public void searchByTitle(String title) { 
		// traversing
		for (Book b: book) {
			// condition
			if(title.contains(b.title)) {		
				System.out.println("Book ID="+b.bookID+ " Title="+b.title+" Author="+b.author+" Category="+b.category+ " Price="+b.price);
			} 
			else {
				System.out.println("Element not found");
				
			} 
		}
	}
	
	// method to search book by author
	public void searchByAuthor(String author) {
		// traversing
		for (Book b: book) {
			// condition
			if(author.contains(b.author)) {			//condition
				System.out.println("Book ID="+b.bookID+ " Title="+b.title+" Author="+b.author+" Category="+b.category+ " Price="+b.price); 
			} 
			else {
				System.out.println("Element not found");
				
			} 
		}
	}
	
	// method to display all elements
	public void displayAll() {
		// traversing
		for (Book b: book) {
			System.out.println("Book ID="+b.bookID+ " Title="+b.title+" Author="+b.author+" Category="+b.category+ " Price="+b.price);
		} 
	}
}
