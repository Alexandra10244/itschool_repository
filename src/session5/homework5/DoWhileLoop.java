package session5.homework5;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter a number to guess: ");
            number = scanner.nextInt();
            if (number < 10) {
                System.out.println("The number is bigger!");
            } else if (number > 10) {
                System.out.println("The number is smaller!");
            } else {
                System.out.println("You found the number " + number + "!");
            }
        } while (number != 10);

    }
}
