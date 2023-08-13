package homework5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != -1) {
            sum += number;
            System.out.println("Sum = " + sum);
            System.out.println("Enter another number or -1 to exit: ");
            number = scanner.nextInt();
        }

    }
}
