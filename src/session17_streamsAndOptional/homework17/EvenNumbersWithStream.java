package session17_streamsAndOptional.homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbersWithStream {
    //Given a list of integers, create a new list that contains only the even numbers.
// Use streams to achieve this.
// (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        evenNumbers(numbers);
    }

    private static void evenNumbers(List<Integer> input) {

        List<Integer> evenNumbers = input.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + evenNumbers);
    }
}
