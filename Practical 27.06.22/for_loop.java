/*
 @Author Sankhajit Roy
*/
// Find the first 10 natural numbers using for loop.

package sankha_java;

public class for_loop {

	public static void main(String[] args) {    // main method
		
		int i = 0;        // declare i = 0
		for(int j = 1;j<=10;j++) {    // no. of time execution
			i = i + j;      // logic
		}
		System.out.print("The sum of first 10 natural numbers: "+i);  // print the output

	}

}
