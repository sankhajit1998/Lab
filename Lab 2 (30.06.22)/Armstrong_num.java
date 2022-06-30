/*
@Author Sankhajit Roy
*/

// Find the Armstrong number.


/*
  num = 153 -- 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153 (it is an Armstrong number)
  num = 122 -- 1*1*1 + 2*2*2 + 2*2*2 = 1 + 8 + 8 = 17 (it is not an Armstrong number)
*/

package Lab;

import java.util.Scanner;   // Scanner package

public class Armstrong_num {

	public static void main(String[] args) {   // main method
		
		Scanner input = new Scanner(System.in);  // create object
		System.out.print("Enter the number: ");
		int num = input.nextInt();    // read the input
		int temp = num;   
		int r,sum=0;
		
		while(num>0) {        
			r = num%10;
			num = num/10;
			sum = sum + r*r*r;
		}
		if(temp == sum)   // 1st condition
			System.out.println(sum+" is an Amrstrong number.");
		else
			System.out.println(sum+" is not an Amrstrong number.");

	}

}
