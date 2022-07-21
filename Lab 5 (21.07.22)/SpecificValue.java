package Lab5;
/*
 * Sankhajit Roy
*/

// Q.1   Write a Java program to test if an array contains a specific value.

public class SpecificValue {  // class
	public static void main(String[] args) {   // main method
		int arr[] = {1789,2035,1899,1456,2013};     // declare values
		int num = 2013;    // find this specific value
		boolean temp = false;   // boolean attribute
		
		for (int i : arr)    // for each loop to check elements
			if (i == num) {   // condition
				temp = true;   // boolean attribute
				break;   // to stop the loop
			}
		
		if (temp)   // boolean true condition
			System.out.println("Found the number "+num);
		else        // boolean false condition
			System.out.println(num+" not found.");
	}
}

