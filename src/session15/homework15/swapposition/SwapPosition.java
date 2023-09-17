package session15.homework15.swapposition;

import java.util.ArrayList;
import java.util.List;

public class SwapPosition<E> {
    //Create a generic method to swap the positions of two elements in an array.


    public static <E> void printArray(E[] array) {
        System.out.println("Numbers: ");
        for (E element : array) {
            System.out.print(element + " ");
        }
    }

    public static <E> void swapPosition(E[] array, int index1, int index2) {

        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Invalid index!");
        }
        E temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        System.out.println();
        System.out.println("Changed the position for element : " + index1 + " and " + index2);
        printArray(array);
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        printArray(numbers);
        swapPosition(numbers, 0, 2);


    }
}
