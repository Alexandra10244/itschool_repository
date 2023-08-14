package session5.homework5;

import java.util.Scanner;

public class FibonacciSeriesGenrerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Invalid number!");
            return;
        }
        int[] fibonacciNumbers = new int[number];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int index = 2; index < number; index++) {
            fibonacciNumbers[index] = fibonacciNumbers[index - 1] + fibonacciNumbers[index - 2];
        }
        for (int fibNumbers : fibonacciNumbers) {
            System.out.print(fibNumbers + " ");
        }
    }

}

