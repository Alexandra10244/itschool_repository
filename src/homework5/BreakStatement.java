package homework5;

import java.util.Scanner;

public class BreakStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        int count2 = 1;
        do {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            sum += number;
            average = (double)sum / count;
            if (number == 0) {
                break;
            } else {
                count++;
                count2 +=count;

            }
        } while (true);
        System.out.println("The average of the entered numbers is: " + average);

    }

}
