package session7.homework7;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of weeks that you want to add: ");
        int numberOfWeeks = scanner.nextInt();
        addWeeksToToday(numberOfWeeks);
    }

    public static void addWeeksToToday(int weeks){
        LocalDate todaysDate = LocalDate.now();
        LocalDate date = todaysDate.plusWeeks(weeks);
        System.out.println(date);
    }
}
