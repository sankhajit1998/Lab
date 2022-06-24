/*
@Author Sankhajit Roy
*/

// get input from user
import java.util.Scanner;  // use Scanner util package for user input
class usr_Input{
	public static void main(String[] args){   // main method
		Scanner name1 = new Scanner(System.in);   // create an Scanner object
		System.out.print("Enter name: ");  
		String name2 = name1.nextLine();   // read user input
        System.out.println("My name is "+name2);   // output of user input		
	}
}
