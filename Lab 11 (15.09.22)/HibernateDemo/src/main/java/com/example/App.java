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
        // using do-while loop to traversing the methods
        do {
        	// creating a scanner class object
        	Scanner scan = new Scanner(System.in);
        	System.out.println("------------------------------------");
        	// take user input
        	System.out.println("1.Add Student Data \n2.Fetch Stdent Data ");
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
        	}
        // pass the condition true	
		} while (true);
    }
}
