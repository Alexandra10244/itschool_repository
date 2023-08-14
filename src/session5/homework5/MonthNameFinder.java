package session5.homework5;

import java.util.Scanner;

public class MonthNameFinder {

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUN = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12: ");
        int month = scanner.nextInt();

        switch (month) {
            case JANUARY -> System.out.println("January");
            case FEBRUARY -> System.out.println("February");
            case MARCH -> System.out.println("March");
            case APRIL -> System.out.println("April");
            case MAY -> System.out.println("May");
            case JUN -> System.out.println("Jun");
            case JULY -> System.out.println("July");
            case AUGUST -> System.out.println("August");
            case SEPTEMBER -> System.out.println("September");
            case OCTOBER -> System.out.println("October");
            case NOVEMBER -> System.out.println("November");
            case DECEMBER -> System.out.println("December");
            default -> System.out.println("Invalid number!");
        }

    }
}
