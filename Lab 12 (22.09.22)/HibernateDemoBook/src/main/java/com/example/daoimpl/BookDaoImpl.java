package com.example.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.dao.BookDao;
import com.example.enity.Book;


public class BookDaoImpl implements BookDao {

	@Override
	public void addBook() {
		// creating scanner class object
		Scanner scan = new Scanner(System.in);
		String name,author;
		double price;
		int year;
		
		// taking user input & read the user input
		System.out.print("Enter Book Name: ");
		name = scan.next();
		System.out.print("Enter Author Name: ");
		author = scan.next();
		System.out.print("Enter Book Pirce: ");
		price = scan.nextDouble();
		System.out.print("Enter Book Publication Year: ");
		year = scan.nextInt();
			
		// creating a employee class object
		Book book = new Book();
		// set values
		book.setBname(name);
		book.setBauthor(author);
		book.setBprice(price);
		book.setByear(year);
		
		// mapping with entity classes
		Session session = HibernateUtil.makeSession();
		// transaction implementation
		Transaction t = session.beginTransaction();
		session.save(book);
		t.commit();		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchBook() {
		
		try {
			// creating scanner class object
			Scanner s1 = new Scanner(System.in);
			int id;
			// taking user input
			System.out.println("Enter ID: ");
			// reading user input
			id = s1.nextInt();
			// create a object from HibernateUtil
			Session session = HibernateUtil.makeSession();
			Book b = session.get(Book.class, id);
			// fetch the data from selected table
			System.out.println("-------------- Book Data --------------");

			
			System.out.print("Book ID:                "+b.getBid());
			System.out.print("\nBook Name:              "+b.getBname());
			System.out.print("\nBook Author Name:       "+b.getBauthor());
			System.out.print("\nBook Price:             "+b.getBprice());
			System.out.print("\nBook Publication Year:  "+b.getByear());
			
			
			System.out.println("\n-------------------------------------");
			
		} catch (Exception e) {
			System.out.println("Data not found.");
		}
		
	}

}
