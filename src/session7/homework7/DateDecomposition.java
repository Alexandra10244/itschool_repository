package session7.homework7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDecomposition {
    public static void main(String[] args) {
        LocalDateTime dateNow = LocalDateTime.now();
        System.out.println(dateNow);
        displayDateComponents(dateNow);
    }

    public static void displayDateComponents(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = localDateTime.format(formatter);
        System.out.print("Year: ");
        for (int index = 0; index <= 3; index++) {
            char year = date.charAt(index);
            System.out.print(year);
        }
        System.out.println();
        System.out.print("Month: ");
        for (int index = 5; index <= 6; index++) {
            char month = date.charAt(index);
            System.out.print(month);
        }
        System.out.println();
        System.out.print("Day: ");
        for (int index = 8; index <= 9; index++) {
            char day = date.charAt(index);
            System.out.print(day);
        }

    }
}
