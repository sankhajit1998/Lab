package Lab_8;
/*
@Author Sankhajit Roy 
*/
// Q2. Write a Java program to compare two array lists.

import java.util.ArrayList;

public class CompareArrayList {  // main class
	public static void main(String[] args) {   // main method
		// create an ArrayList object
		ArrayList<String> list1 = new ArrayList<>();  // list 1
		// add elements
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("White");
		list1.add("Pink");
		
		System.out.println("First List: "+list1);
		// create another ArrayList object
		ArrayList<String> list2 = new ArrayList<>();   // list 2
		// add elements
		list2.add("Red");
		list2.add("Green");
		list2.add("Black");
		list2.add("Pink");
		
		System.out.println("Second List: "+list2);
		System.out.print("Compared between two list elements: ");
		// loop will check all elements and compare side by side from both list
		for(String i: list1) {
			if(list2.contains(i)) {   // if element match then it will print yes
				System.out.print(" Yes ");
			}
			else {                    // if element don't match then it will print no
				System.out.print(" No ");
			}
		}
	}
}
