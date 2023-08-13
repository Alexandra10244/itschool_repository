package homework5;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int arrayElement : arrayNumbers) {
            if (arrayElement % 2 == 0) {
                {
                    evenNumbers.add(arrayElement);
                }
            } else {
                oddNumbers.add(arrayElement);
            }
        }
        System.out.print("Even numbers: ");
        printArray(evenNumbers);
        System.out.println();
        System.out.print("Odd numbers: ");
        printArray(oddNumbers);
    }

    public static void printArray(ArrayList<Integer> arrayList) {
        for (int arrayElment : arrayList) {
            System.out.print(arrayElment + " ");

        }
    }
}
