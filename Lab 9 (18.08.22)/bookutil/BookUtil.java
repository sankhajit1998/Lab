package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {
	public static void main(String[] args) {
		BookStore bookstore = new BookStore();
		
		Scanner scan = new Scanner(System.in);

		for(int i=1; i<=3; i++) {
			System.out.print("Enter Book ID: ");
			String id = scan.nextLine();
			System.out.print("Enter Title: ");
			String title = scan.nextLine();
			System.out.print("Enter Author: ");
			String author = scan.nextLine();
			System.out.print("Enter Category: ");
			String category = scan.nextLine();
			System.out.print("Enter Price: ");
			float price = scan.nextFloat();
			
			bookstore.addBook(new Book(id, title, author, category, price));
			bookstore.displayAll();
		}
		System.out.println("Enter title: ");
		String searchTitle = scan.nextLine();
		bookstore.searchByTitle(searchTitle);
		
		System.out.println("Enter author: ");
		String searchAuthor = scan.nextLine();
		bookstore.searchByAuthor(searchAuthor);
		
		scan.close();
		
	}
}
