package Lab_6;
/*
@author Sankhajit Roy
*/
/*
Q. 3  Write a Java program to find sequences of lowercase letters joined with a underscore.
*/

public class StringSequence {    // class
	
	public static void main(String[] args) {  // main method
		   
	    System.out.println(match("java_exercises"));	
		System.out.println(match("Java_Exercises"));	
        }

   public static String match(String text) {   // method
	   if (text.matches("^[a-z]+_[a-z]+$"))    // condition to get matches
                return "Found a match!";
       else
                return "Not matched!";
   }
}
