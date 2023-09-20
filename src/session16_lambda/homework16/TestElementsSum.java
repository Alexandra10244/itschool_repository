package session16_lambda.homework16;

import java.util.Arrays;
import java.util.List;

public class TestElementsSum {
    //Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 3, 10);

        System.out.println("Sum: "+ sumResult(numbers));
    }

    public static int sumResult(List<Integer> numbers) {
        final int[] sum = {0};

        numbers.forEach(number -> sum[0] += number);
        return sum[0];
    }
}
