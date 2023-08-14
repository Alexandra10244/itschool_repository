package session3.homework3;

import java.util.Scanner;

public class NumberSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("You entered a positive number:" + number);
        } else {
            System.out.println("You entered a negative number:" + number);
        }
    }
}
