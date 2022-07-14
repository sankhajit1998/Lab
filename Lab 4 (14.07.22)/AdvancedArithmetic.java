package Lab;

/*
@author Sankhajit Roy
*/

// sum of divisor.

import java.util.Scanner;

interface AdvancedArithmetic {   // interface
  int divisor_sum(int n);
}
class Main{   // main class
	public static void main(String[] args) {   // main method
	    Scanner temp = new Scanner(System.in);    // scanner object
	    System.out.print("Enter number: ");
        int n = temp.nextInt();                // to read user input
		MyCalculator c = new MyCalculator();    // object
		System.out.println("I implemented: AdvancedArithmetic "+c.divisor_sum(n));
	}
}

class MyCalculator implements AdvancedArithmetic{    // sub class
    
    public int divisor_sum(int n){    // method
        int sum1 = 1;
        for (int i=2;i<=n;i++){     // loop
            if (n%i == 0){    // condition
                sum1 = sum1 + i;
            }
        }
        return sum1;
    }
}