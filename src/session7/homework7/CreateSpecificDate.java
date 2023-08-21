package session7.homework7;

import java.time.LocalDate;

public class CreateSpecificDate {
    public static void main(String[] args) {
        createSpecificDate();
    }

    public static void createSpecificDate() {
        LocalDate date = LocalDate.of(2025, 8, 19);
        System.out.println(date);
    }
}
