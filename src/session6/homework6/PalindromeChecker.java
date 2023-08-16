package session6.homework6;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder reverseWord = stringBuilder.append(word).reverse();
        String reverseWordStr= reverseWord.toString();

        if(reverseWordStr.toLowerCase().equals(word.toLowerCase())){
            System.out.println("You entered a palindrome.");
        } else{
            System.out.println("This word is not a palindrome.");

        }

    }
}
