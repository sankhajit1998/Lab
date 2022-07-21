package Lab5;
/*
@author Sankhajit Roy
*/

/* Q.3   we need to print the elements of the array which are present in odd positions. 
This can be accomplished by looping through the array and printing the elements of an array 
by incrementing i by 2 till the end of the array is reached. */

public class OddPosition {   // class 
	public static void main(String[] args) {   // main method
		char arr[] = {'a','b','c','d','e'};   // declare values
		
		System.out.print("The elements present on odd positions are: ");  
		
		for(int i = 0; i<arr.length; i++)   // loop to check all elements
			if(i%2==0) {    // condition
				System.out.print(arr[i]+" ");
			}
	}
}
