package session17_streamsAndOptional.homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    //Using a list of strings, find and print the longest string using Java streams.
    // (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        longestString(fruits);
    }

    private static void longestString(List<String> input) {
        String value = input.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse("");

        System.out.println("The longest string is: " + value + " with " + value.length() + " characters");
    }
}
