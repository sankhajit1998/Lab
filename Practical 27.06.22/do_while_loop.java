/*
@Author Sankhajit Roy 
*/
// Find The even number using do while loop.

package sankha_java;

public class do_while_loop {

	public static void main(String[] args) {
		
		int i = 0;    // declare i = 0
		System.out.println("First 10 even numbers: ");   
		do {       // took do while
			System.out.println(i);    // print the output
			i = i + 2;   // logic
		}
		while(i<=10);   // no. of time execution
	}

}
