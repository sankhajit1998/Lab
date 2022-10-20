package movietheatre;
/*
@Author Sankhajit Roy
*/

/* 2. Create a movietheatre class and movie class in which we can add movie details like movieName, movieStartTime, movieEndTime, movieTicketPrice and print the all details of the movie  */

import java.util.Scanner;

public class Movie {
    // taking private instance variables
    private String movieName;
    private String movieStartTime;
    private String movieEndTime;
    private double movieTicketPrice;

//=======================================================================================

    Scanner sc = new Scanner(System.in);

    // method to add movie
    public void addMovie() {
        System.out.print("Enter movie name: ");
        movieName = sc.nextLine();
        System.out.print("Enter movie start time: ");
        movieStartTime = sc.nextLine();
        System.out.print("Enter movie end time: ");
        movieEndTime = sc.nextLine();
        System.out.print("Enter movie ticket price: ");
        movieTicketPrice = sc.nextDouble();
    }

    // method to show movie details
    public void movieDetails() {
        System.out.print("Name of the movie: " + movieName);
        System.out.print("\nStart time of the movie: " + movieStartTime);
        System.out.print("\nEnd time of the movie: " + movieEndTime);
        System.out.print("\nPrice of the movie: " + movieTicketPrice);
    }

}
