package com.example;
/*
@Author Sankhajit Roy
*/
import java.util.Scanner;

import com.example.daoimpl.StudentDaoImpl;

public class App {    // main class
	
    public static void main( String[] args ) {    // main method
    	// creating a class object
        StudentDaoImpl dao = new StudentDaoImpl();
        char c;
        
        
        // using do-while loop to traversing the methods
        do {
        	// creating a scanner class object
        	Scanner scan = new Scanner(System.in);
        	System.out.println("------------------------------------");
        	// take user input
        	System.out.println("1.Add Student Data \n2.Fetch Student Data\n3.Delete Student Data\n4.Update Student Data\n5.Exit ");
        	// reading user input
        	int a = scan.nextInt();
        	// to get the method
        	switch(a) {
        	
        	// called method to add student data
        	case 1: dao.addStudent();
        		break;
        	// called method to fetch student data
        	case 2: dao.fetchStudent();
        		break;
        	// called method to delete student data
        	case 3: dao.deleteStudent();
        		break;
        	// called method to update student data
        	case 4: dao.updateStudent();
        		break;
        	// Exit
        	case 5: System.exit(0);
        		System.out.println("Thank You.");
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
