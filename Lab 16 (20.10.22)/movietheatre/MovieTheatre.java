package movietheatre;
/*
@Author Sankhajit Roy
*/
import java.util.Scanner;

public class MovieTheatre {     // main class

    public static void main(String[] args) {    // main method
        // created a scanner class object
        Scanner sc = new Scanner(System.in);
        // created a movie class object
        Movie m = new Movie();
        // loop runs until number 3 is not pressed to exit
        int ch;
        do {
            System.out.println("\n *** Movie Ticket Booking*** ");
            System.out.println("1. Add movie \n2. Show movie details \n3. Exit ");
            System.out.println("Enter your choice: ");

            // switch case to choose method
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("--------Add movie--------");
                    m.addMovie();
                    break;
                case 2:
                    System.out.println("--------Movie Details--------");
                    m.movieDetails();
                    break;
                case 3:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 3);
    }
}
