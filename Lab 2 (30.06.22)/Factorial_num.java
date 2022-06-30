/*
@Author Sankhajit Roy
*/

// Find the factorial number.

package Lab;

import java.util.Scanner;   // Scanner package

public class Factorial_num {

	public static void main(String[] args) {   // main method
		int fact=1;
		Scanner temp = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num= temp.nextInt();    //It is the number to calculate factorial    
		for(int i=1;i<=num;i++){    // n5 = n5*n4*n3*n2*n1 = n120 
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is: "+fact); 

	}

}
