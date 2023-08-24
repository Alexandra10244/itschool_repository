package session8.homework8;

import java.util.Scanner;

public class BinaryToInteger {
    //Accept a string representation of a binary number, e.g., "1011".
    // Convert this string into an Integer using the Integer wrapper class and the method that parses binary.
    // Print out the decimal representation of this number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryNumber= scanner.nextLine();

        int intNumber = Integer.parseInt(binaryNumber,2);
        System.out.println("The number is: "+ intNumber);
    }
}
