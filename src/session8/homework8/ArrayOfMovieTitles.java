package session8.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfMovieTitles {
    //In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
    // If it does, print out its position in the array.
    public static void main(String[] args) {
        String[] movieTitle = {"Barbie", "It", "MIB"};

        searchMovie(movieTitle);


    }

    public static void searchMovie(String[] movieTitle){
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(movieTitle);
        for(String movie:movieTitle ){
            System.out.print(movie + " ");
        }
        System.out.println("Enter a movie title: ");
         String searchInput =scanner.nextLine();
        int serachResult = Arrays.binarySearch(movieTitle,searchInput);
        if(serachResult > 0){
            System.out.println("Movie found at the position: "+ serachResult);
        } else{
            System.out.println("Movie not found!");
        }

    }
}
