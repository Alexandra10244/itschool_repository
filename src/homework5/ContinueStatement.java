package homework5;

import java.util.Scanner;

public class ContinueStatement {

    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[10];
        printNumbers(numbers);
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] <= 5) {
                continue;
            } else {
                sum += numbers[index];

            }
        }
        System.out.println("Sum= " + sum);
    }

    public static void printNumbers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print((index + 1) + ": ");
            numbers[index] = scanner.nextInt();

        }
    }
}
