package session5.homework5;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("You entered an even number! " + number);
        } else {
            System.out.println("You entered an odd number! " + number);
        }
    }
}
