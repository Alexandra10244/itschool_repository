package homework5;

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        char[] charText = text.toCharArray();


        for (int index = charText.length - 1; index >= 0; index--) {
            System.out.print(charText[index]);
        }


    }
}
