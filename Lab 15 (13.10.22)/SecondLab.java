/*
@Author Sankhajit Roy
*/
package Lab;
/*
Take a variable from scanner class, given two (A,B) strings in lowercase.
1. calculate the sum of string length of A and B.
2. check either A > B or not. (lexicographically) true/false
3. capitalized first latter of A and B.
*/
import javax.print.DocFlavor;
import java.util.Scanner;

// main class
public class SecondLab {
    // method for statement 1 with two parameter
    public static void statement1(String str1,String str2) {
        // print lengths of two string value
        System.out.println("Length of string 1: "+str1.length()+" and string 2: "+str2.length());
        // calculate sum of lengths of two string value
        System.out.print ("The sum of 2 string length: "+(str1.length()+str2.length()));

    }
    // method for statement 2 with two parameter
    public static void statement2(String str1,String str2) {
        // comparing str1 and str2
        int retrive = str1.compareTo(str2);
        // prints the return value of the comparison
        if (retrive < 0) {
            System.out.println("Comparison is "+true);
        } else {
            System.out.println("Comparison is "+false);
        }
    }
    // method for statement 3 with two parameter
    public static void statement3(String str1,String str2) {
        // print capitalized first latter of two string value
        System.out.println("Capitalized of two strings: ");
        System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1));
        System.out.println(str2.substring(0, 1).toUpperCase() + str2.substring(1));
    }

    // main method
    public static void main(String[] args) {
        // created a scanner class object
        Scanner scan = new Scanner(System.in);
        // take input of first string value from user
        System.out.print("Enter String 1: ");
        String str1 = scan.next();
        // take input of second string value from user
        System.out.print("Enter String 2: ");
        String str2 = scan.next();
        // called all methods
        System.out.println("===========Statement 1===========");
        statement1(str1,str2);
        System.out.println("\n===========Statement 2===========");
        statement2(str1,str2);
        System.out.println("===========Statement 3===========");
        statement3(str1,str2);
    }
}
