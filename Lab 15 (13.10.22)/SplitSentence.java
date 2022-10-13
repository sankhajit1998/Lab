/*
@Author Sankhajit Roy
*/
import java.util.Scanner;

public class SplitSentence {   // main class

    public static void main(String[] args) {    // main method
        // create a scanner class object
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.println("Please enter a sentence.");
        // read user input
        String scan = sc.nextLine();
        // spilt the sentence and store into sp[] array
        String sp[] = scan.split("\\s+");

        // for loop to determine length of split sentence
        for(int i=0;i<sp.length;i++)
            // for loop to determine length of words
            for(int j=i;j<sp.length;j++)
                // condition to print ascending order
                if (sp[i].length() > sp[j].length()) {
                    // comparing the words one by one
                    String temp = sp[i];
                    sp[i] = sp[j];
                    sp[j] = temp;
                }
        // will print content of array sp
        for(String i:sp) {
            System.out.println(i);
        }
    }
}
