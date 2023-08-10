package session4.homework;

public class FactorialNumber {

    public static void main(String[] args) {

        int number = 3;
        int factorial = 1;

        for (int index = 1; index <= number; index++) {
             factorial *= index;
        }

        System.out.println("Number! = " + factorial);
    }
}
