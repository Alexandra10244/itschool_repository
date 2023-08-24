package session8.homework8;

import java.util.Scanner;

public class EvenOddArray {

    public static void main(String[] args) {
        //Given an array of 10 integers, count how many of them are even numbers and how many are odd.
        // Print out both counts.
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        for (int index = 0; index < 10; index++) {
            System.out.print((index + 1) + ": ");
            numbers[index] = scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        oddOrEvenNumbers(numbers);
    }

    public static void oddOrEvenNumbers(int[] numbers) {

        int[] evenList = new int[10];
        int[] oddList = new int[10];
        int countOdd = 0;
        int countEven = 0;

        for (int index = 0; index < 10; index++) {
            if (numbers[index] % 2 == 0) {
                evenList[countEven] = numbers[index];
                countEven++;
            } else {
                oddList[countOdd] = numbers[index];
                countOdd++;
            }
        }
        System.out.println("The array contains " + countOdd + " odd numbers: ");
        for (int index = 0; index < countOdd; index++) {
            System.out.print(oddList[index] + " ");
        }
        System.out.println();
        System.out.println("The array contains " + countEven + " even numbers: ");
        for (int index = 0; index < countEven; index++) {
            System.out.print(evenList[index] + " ");
        }

    }
}
