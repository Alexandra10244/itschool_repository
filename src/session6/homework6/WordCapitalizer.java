package session6.homework6;

import java.util.Scanner;

public class WordCapitalizer {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        String sentence = scanner.nextLine();
        stringBuilder.append(sentence);
        char buffer = stringBuilder.charAt(0);
        buffer = Character.toUpperCase(buffer);
        stringBuilder.replace(0, 1, String.valueOf(buffer));
        for (int index = 0; index < stringBuilder.length(); index++) {
            if (index + 3 < stringBuilder.length() && stringBuilder.charAt(index) == '.') {
                buffer = stringBuilder.charAt(index + 2);
                buffer = Character.toUpperCase(buffer);
                stringBuilder.replace(index + 2, index + 3, String.valueOf(buffer));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
