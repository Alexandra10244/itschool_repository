package session4.homework;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        listOne.add(24);
        listOne.add(4);
        listOne.add(15);
        listOne.add(99);

        listTwo = listOne;
        listOne.add(100);

        System.out.println("List one: " + listOne);
        System.out.println("List two: " + listTwo);

    }
}
