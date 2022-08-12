package Lab_8;
/*
@Author Sankhajit Roy
*/
// Q3. Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;

public class SpecifiedElementList {  // main class
	public static void main(String[] args) {   // main method
		// create a LinkedList object
		LinkedList<String> list = new LinkedList<>();
		// add all elements
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println(list);
		// add new elements in first position
		list.addFirst("Blue");
		System.out.println(list);
	}
	
	
}
