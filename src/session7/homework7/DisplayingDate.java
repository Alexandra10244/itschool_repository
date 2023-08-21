package session7.homework7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayingDate {
    public static void main(String[] args) {

        displayTodaysDate();

    }

    public static void displayTodaysDate() {
        LocalDateTime dateNow = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String stringDate = dateNow.format(format);
        System.out.println("Today's date: " + stringDate);


    }
}
