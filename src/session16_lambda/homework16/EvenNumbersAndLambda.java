package session16_lambda.homework16;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersAndLambda {

    //Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 34, 78, 6, 3, 53);

        filterNumber(numbers);
    }

    private static void filterNumber(List<Integer> numbers) {
        numbers.forEach(number -> {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        });
    }
}
