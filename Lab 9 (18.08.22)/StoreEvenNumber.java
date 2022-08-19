package Lab_9;
/*
@Author Sankhajit Roy
*/

// Q1. problem statement 1

import java.util.ArrayList;

public class StoreEvenNumber {   // main class
	// created a private ArrayList object
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public ArrayList<Integer> storeEvenNumbers(int n) {    // method 1
		list = new ArrayList<Integer>();  // object
		// loop to get even number
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) list.add(i);   // logic
		}
		return list;
	}
	public ArrayList<Integer> retrieveEvenNumber(int n) {   // method 2
		// created a new ArrayList
		ArrayList<Integer> newList = new ArrayList<Integer>();
		// traversing
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		return newList;
	}

	public static void main(String[] args) {   // main method
		StoreEvenNumber asg = new StoreEvenNumber();    // class object
		asg.storeEvenNumbers(10);   // called method 1
		asg.retrieveEvenNumber(0);  // called method 2
		

	}

}
