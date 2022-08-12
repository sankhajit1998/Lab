package Lab_8;
/*
@Author Sankhajit Roy
*/
// Q4. Write a Java program to replace an element in a linked list.

import java.util.LinkedList;

public class ReplaceElementList {   // main class
	public static void main(String[] args) {    // main method
		// create a LinkedList object
		LinkedList<String> list = new LinkedList<>();
		// adding element
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("Before Replacement: "+list);
		// replace the element from index position 2
		list.set(2,"Yellow");
		System.out.println("After Replacement: "+list);
	}
}
