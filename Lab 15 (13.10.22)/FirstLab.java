/*
@Author Sankhajit Roy
*/
package Lab;

import java.util.Scanner;
/*
Given a no. of n for each integer i in the range id 1 to n. print one value per line.
if i is multiple of 3 and 5; print good morning
if i is multiple of 3 but not 5; print good
if i is multiple of 5 but not 3; print morning
if i is not multiple of  3 and 5; print value of i.
*/
public class FirstLab {     // main class
    // method of statement
    public static void statement(){
        // created scanner class object
        Scanner scan = new Scanner(System.in);
        // taking user input
        System.out.print("Enter input: ");
        int n = scan.nextInt();
        // for loop to set range
        for (int i = n; i<=20; i++) {
            // condition to print accordingly
            if(0 == i % 3 && 0 == i % 5){
                System.out.println("Good Morning");
            } else if (0 == i % 3 && !(0 == i % 5)) {
                System.out.println("Good");
            }else if (0 == i % 5 && !(0 == i % 3)) {
                System.out.println("Morning");
            } else {
                System.out.println(i);
            }
        }
    }
    // main method
    public static void main(String[] args) {
        // called method
        statement();
    }
}
