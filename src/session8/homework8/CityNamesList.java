package session8.homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityNamesList {
    //Create an ArrayList that stores city names. Add at least five city names initially.
    // Then, prompt the user to add a city name.
    // If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cityNames = new ArrayList<>();
        cityNames.add("Arad");
        cityNames.add("Timisoara");
        cityNames.add("Bucuresti");
        cityNames.add("Brasov");
        cityNames.add("Iasi");

        System.out.println(cityNames);
        System.out.println("Enter a city name:");
        String input = scanner.nextLine();

        boolean isDuplicate = false;
        for (String name : cityNames) {
            if (input.equals(name)) {
                isDuplicate = true;
            }
        }
        if (isDuplicate) {
            System.out.println("It's a duplicate");
        } else {
            cityNames.add(input);
        }
        System.out.println(cityNames);

    }

}
