package session3.homework3;

import java.util.Scanner;

public class DisplayResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to numbers:");
        System.out.println("First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Addition = " + (firstNumber + secondNumber));
        System.out.println("Subtraction = " + (firstNumber - secondNumber));
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        System.out.println("Division = " + (firstNumber / secondNumber));
        System.out.println("Modulus = " + (firstNumber % secondNumber));
    }
}
