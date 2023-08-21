package session7.homework7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class IntervalBetweenDates {
    public static void main(String[] args) {
        daysBetween();
    }

    public static void daysBetween() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two dates usig format yyy-MM-dd: ");
        System.out.println("Date 1: ");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String inputDate1 = scanner.next();
        LocalDate date1 = LocalDate.parse(inputDate1, format);

        System.out.println("Date 2: ");
        String inputDate2 = scanner.next();
        LocalDate date2 = LocalDate.parse(inputDate2, format);

        long daysBetweenDates= ChronoUnit.DAYS.between(date1,date2);
        System.out.println("Number of days between the two dates: " +daysBetweenDates);
    }
}
