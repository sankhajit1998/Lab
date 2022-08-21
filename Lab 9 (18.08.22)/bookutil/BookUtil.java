package com.bookutil;
/*
@Author Sankhajit Roy
*/

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {    // main class
	public static void main(String[] args) {    // main method
		BookStore bookstore = new BookStore();   // BookStore class object
		
		// Scanner class object
		Scanner temp = new Scanner(System.in);
		
		// take user input to how many book object want to add from user
		System.out.println("How many book you want?");
		int n = temp.nextInt();
		// using loop to implement object
		for(int i=1; i<=n; i++) {
			
			// taking user input for book id
			Scanner scan1 = new Scanner(System.in);
			System.out.print("Enter Book ID: ");
			String id = scan1.nextLine();
			
			// taking user input for book title
			Scanner scan2 = new Scanner(System.in);
			System.out.print("Enter Title: ");
			String title = scan2.nextLine();
			
			// taking user input for book author
			Scanner scan3 = new Scanner(System.in);
			System.out.print("Enter Author: ");
			String author = scan3.nextLine();
			
			// taking user input for book catagory
			Scanner scan4 = new Scanner(System.in);
			System.out.print("Enter Category: ");
			String category = scan4.nextLine();
			
			// taking user input for book price
			Scanner scan5 = new Scanner(System.in);
			System.out.print("Enter Price: ");
			float price = scan5.nextFloat();
			
			// for make gape between output
			System.out.println();
		
			// called addBook method to add elements in the Array list
			bookstore.addBook(new Book(id, title, author, category, price));
		
		}
		// to display all elements
		bookstore.displayAll();
		
		// for make gape between output
		System.out.println();
		
		// scanner class object
		Scanner scan = new Scanner(System.in);
		
		// taking user input to search by title
		System.out.print("Enter title: ");
		String searchTitle = scan.nextLine();
		bookstore.searchByTitle(searchTitle);
		
		// for make gape between output
		System.out.println();
		
		// taking user input to search by author
		System.out.print("Enter author: ");
		String searchAuthor = scan.nextLine();
		bookstore.searchByAuthor(searchAuthor);
		
		// to scanner object
		scan.close();
	}
}
