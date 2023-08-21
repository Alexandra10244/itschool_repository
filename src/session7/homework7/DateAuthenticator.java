package session7.homework7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAuthenticator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date using format YYYY-MM-DD:");
        String inputDate = scanner.nextLine();
        System.out.println(isValidDate(inputDate));

    }

    public static boolean isValidDate(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder year = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder day = new StringBuilder();
        int lastIndexOf = 0;
        int index = 0;
        while (stringBuilder.charAt(index) != '-') {
            index++;
        }
        year.append(stringBuilder.substring(0, index));
        if (year.length() != 4) {
            return false;
        }
        index++;
        lastIndexOf = index;
        while (stringBuilder.charAt(index) != '-') {
            index++;
        }
        month.append(stringBuilder.substring(lastIndexOf, index));
        if (Integer.parseInt(month.toString()) < 1
                || Integer.parseInt(month.toString()) > 12) {
            return false;
        }
        index++;
        day.append(stringBuilder.substring(index));
        switch (Integer.parseInt(month.toString())) {
            case 1, 3, 5, 7, 8, 10, 12: {
                if (Integer.parseInt(day.toString()) > 31) {
                    return false;
                }
                break;
            }
            case 4, 6, 9, 11: {
                if (Integer.parseInt(day.toString()) > 30) {
                    return false;
                }
                break;
            }
            case 2: {
                if (Integer.parseInt(year.toString()) % 4 != 0
                        && Integer.parseInt(day.toString()) > 28) {
                    return false;
                } else if (Integer.parseInt(year.toString()) % 4 == 0
                        && Integer.parseInt(day.toString()) > 29) {
                    return false;
                }
            }
        }
        return true;
    }
}
