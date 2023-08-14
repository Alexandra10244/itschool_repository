package session5.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
//        printNumberWithWhile(10);
//        printNumberDoWhile(10);
//        printNumberWhiteFor(10);

        List<String> list = new ArrayList<>();
        list.add("Timisoara");
        list.add("Bucuresti");
        list.add("Cluj");

        //printListWithForEach(list);
        printListWithFor(list);

    }

    public static void printNumberWithWhile(int input) {
        int number = 1;

        while (number < input) {
            System.out.print(number + ", ");
            number++;
            if (number == input) {
                System.out.println(number);
            }
        }
    }

    public static void printNumberDoWhile(int input) {
        int number = 1;
        do {
            System.out.print(number + ", ");
            number++;
            if (number == input) {
                System.out.println(number);
            }


        } while (number < input);
    }

    public static void printNumberWhiteFor(int input) {
        for (int number = 1; number <= input; number++) {
            if (number == input) {
                System.out.println(number);
            } else {
                System.out.print(number + ", ");
            }
        }

    }

    public static void printListWithForEach(List<String> list) {
        int listSize = list.size();
        int count = 0;
        for (String listValue : list) {
            count++;
            if (count == listSize - 1) {
                System.out.print(listValue);
            } else {
                System.out.print(listValue + ", ");
            }
        }
    }

    public static void printListWithFor(List<String> list) {

        for (int index = 0; index < list.size(); index++) {
            if (index == list.size() - 1) {
                System.out.println(list.get(index));
            }
            System.out.println(list.get(index));
        }

    }
}
