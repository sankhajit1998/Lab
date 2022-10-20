/*
@Author Sankhajit Roy
*/

/* 3. Write a Java Program to Create a new text file and read the input from the user, save the input in the text file. */

import java.io.FileReader;
import java.io.FileWriter;

public class WriteText {     // main class
    public static void main(String[] args) {   // main method
        // try block
        try {
            // create FileWriter object with file path
            FileWriter fw = new FileWriter("E:\\test.txt");
            fw.write("My name is Sankhajit Roy.");
            // create FileReader object with file path
            FileReader fr = new FileReader("E:\\test.txt");

            int i;
            while((i = fr.read())!=-1) {   // using loop to check all characters
                System.out.println((char)i);
            }
            fw.close();   // close object
            fr.close();   // close object
            System.out.println("Done!");
        }
        // catch block with exception
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
