package session7.homework7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ComparingDates {
    public static void main(String[] args) {

        areDatesEqual();
    }

    public static void areDatesEqual() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two date using the format yyy-MM-dd.");
        System.out.println("Date1: ");
        String inputDate1 = scanner.next();
        LocalDate date1 = LocalDate.parse(inputDate1, format);
        System.out.println("Date2: ");
        String inputDate2 = scanner.next();
        LocalDate date2 = LocalDate.parse(inputDate2, format);

        boolean dates;

        if (date1.isEqual(date2)) {
            dates = true;
            System.out.println(dates);
        } else {
            dates = false;
            System.out.println(dates);
        }
    }
}
