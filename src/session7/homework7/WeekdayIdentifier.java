package session7.homework7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WeekdayIdentifier {
    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);
        findDayOfWeek(todayDate);
    }

    public static void findDayOfWeek(LocalDate localDate) {
        localDate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDate = localDate.format(format);

        LocalDate parseCurrentDate = LocalDate.parse(currentDate, format);
        DayOfWeek dayOfWeek = parseCurrentDate.getDayOfWeek();
        System.out.println(dayOfWeek);


    }
}
