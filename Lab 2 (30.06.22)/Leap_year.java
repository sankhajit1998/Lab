/*
@Author Sankhajit Roy
*/

// Find the year is Leap year or not.

package Lab;

import java.util.Scanner;   // Scanner package

public class Leap_year {

	public static void main(String[] args) {   // main method
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		// 2020 = 2020 % 4
		
		if(year%4==0 && year%100!=0) {      // 1st condition
			System.out.println(year+" is a Leap year.");
		}
		else if(year%100==0) {              // 2nd condition
			System.out.println(year+" is not a Leap year.");
		}
		else if(year%400==0) {              // 3rd condition
			System.out.println(year+" is a Leap year.");
		}
		else {                              
			System.out.println(year+" is not a Leap year.");
		}

	}

}
