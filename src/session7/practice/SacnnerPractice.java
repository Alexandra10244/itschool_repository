package session7.practice;

import java.util.Scanner;

public class SacnnerPractice {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a name: ");
//        String userName = scanner.next();
//        System.out.println("Hello "+ userName + "!");
        printUserInfo();
    }

    public static void printUserInfo(){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter a name: ");
       String userName = scanner.next();

        System.out.println("Please enter your age: ");
        int userAge = scanner.nextInt();

        System.out.println("Are you a student? ( true/false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("User: "+ userName+ "age: "+ userAge + ", Student: "+ isStudent);
    }
}
