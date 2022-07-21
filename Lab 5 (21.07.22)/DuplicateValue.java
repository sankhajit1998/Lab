package Lab5;
/*
@author Sankhajit Roy
*/

// Q.2   Write a Java program to find the duplicate values of an array of integer values.

public class DuplicateValue {    // class 

	public static void main(String[] args) {    // main method
		int arr[] = {5,2,7,7,5};    // declare values
		
		System.out.print("All elements: ");
		for(int k = 0; k<arr.length;k++)    // loop to print all elements in array
			System.out.print(arr[k]+" ");
		
		System.out.print("\nDuplicate values in array: ");    
		for(int i = 0; i<arr.length; i++)    // loop to check all all elements
			for(int j = i+1; j<arr.length; j++)     // loop to compare elements for duplicate values
				if(arr[i] == arr[j])     // condition
					System.out.print(arr[j]+" ");	
	}

}
