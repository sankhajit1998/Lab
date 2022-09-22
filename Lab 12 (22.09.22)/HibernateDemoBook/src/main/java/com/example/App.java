package com.example;

import java.util.Scanner;

import com.example.daoimpl.BookDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        BookDaoImpl dao = new BookDaoImpl();
        char c;
    	
        do {
        	// creating a scanner class object
        	Scanner scan = new Scanner(System.in);
        	System.out.println("-------------- Menu --------------");
        	// take user input
        	System.out.println("1. Add Book Data. \n2. Fetch Book Data \n3. Exit ");
        	// reading user input
        	int a = scan.nextInt();
        	// to get the method
        	switch(a) {
        	
        	// called method to add book data
        	case 1: dao.addBook();
        		break;
        	// called method to fetch book data
        	case 2: dao.fetchBook();
        		break;
        	// Exit
        	case 3: 
        		System.out.println("Thank You.");
        		System.exit(0);
        		break;
        	// default case for invalid choice	
        	default: System.out.println("Invalid Choice!");
        	}
        	// to continue run the operation or not
        	System.out.println("Do you want to continue? Y/N");
        	c = scan.next().charAt(0);
        	
        	
        // pass the condition to continue or not	
		} while (c == 'y' || c=='Y');
        System.out.println("Thank You.");
        
    }
}
