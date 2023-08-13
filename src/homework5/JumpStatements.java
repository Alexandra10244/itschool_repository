package homework5;

import java.util.Scanner;

public class JumpStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        int menu = 0;

        while (menu != 3) {
            System.out.println("======================");
            System.out.println("Choose an option: ");
            System.out.println("1: Hello World!");
            System.out.println("2: For your name");
            System.out.println("3: If you want to exit the menu!");
            menu = scanner.nextInt();

            switch (menu) {
                case 1 -> System.out.println("Hello World!");
                case 2 -> System.out.println(name);
                case 3 -> System.out.println("Exit");
                default -> System.out.println("Invalid option");
            }
        }

    }
}
