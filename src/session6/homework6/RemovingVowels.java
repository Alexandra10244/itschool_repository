package session6.homework6;

import java.util.Scanner;

public class RemovingVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        String sentence = scanner.nextLine();
        String sentenceWithoutVowels = removeVowels(sentence);
        System.out.println(sentence);
        System.out.println(sentenceWithoutVowels);


    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAeiou";

        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (!vowels.contains(String.valueOf(currentChar))) {
                result.append(currentChar);
            }

        }
        return result.toString();
    }
}
