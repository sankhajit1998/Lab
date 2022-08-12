package Lab_8;
/*
@Author Sankhajit Roy 
*/
// Q1. Write a Java program to extract a portion of an array list.

import java.util.ArrayList;

public class ExtarctFromList {   // main class
	public static void main(String[] args) {   // main method
		// create an ArrayList object 
		ArrayList<String> list = new ArrayList<>();
		// add elements
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("All Elements: "+list);
		// extract the specific portion
		System.out.println("Extracted portion: "+list.subList(0, 3));
	}
}
