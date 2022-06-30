/*
@Author Sankhajit Roy
*/

// Print the pattern.

package Lab;

public class Pattern_print {
	public static void main(String[] args) {   // main method
		int num = 5;
		for(int i = 0; i <num; i++) {   // 1st loop
			for(int j = num-i; j>1;j--) {   // 2nd loop to print " "
				System.out.print(" ");
			}
			for(int j = 0; j<=i;j++) {    // 3rd loop to print "*"
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
