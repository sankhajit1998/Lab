/*
@Author Sankhajit Roy
*/

// Find the prime number.

package Lab;

import java.util.Scanner;    // Scanner package
public class Prime_num {

	public static void main(String[] args) {   // main method
		
		int i,j=0,flag=0;
		Scanner temp = new Scanner(System.in);   // scanner object
		System.out.print("Enter the number: ");
		int num = temp.nextInt();   // read the input
		
		j=num/2;
		
		if(num==0||num==1){   // 1st condition
			System.out.println(num+" is not a prime number.");
		}
		else{
			for(i=2;i<=j;i++){   // loop for 2nd condition
				if(num%i==0){     // 2nd condition
					System.out.println(num+" is not a prime number.");
					flag=1;
					break;
				}
					
		}
			if(flag==0) {   // 3rd condition
				System.out.println(num+" is a prime number."); 
				}
		}
	}

}
