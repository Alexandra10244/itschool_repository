package session7.homework7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GettingCurrentTime {

    public static void main(String[] args) {
        displayCurrentTime();
    }

    public static void displayCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = currentTime.format(format);
        System.out.println(time);
    }

}
