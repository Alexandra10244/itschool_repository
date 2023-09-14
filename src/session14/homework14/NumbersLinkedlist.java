package session14.homework14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class NumbersLinkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = initializeList();
        printList(numbers);

        System.out.println();
        System.out.println("Add the last element: " + appendLastElement(numbers, 30));

        System.out.println();
        System.out.println("List starting from position 4: " + startSpecifiedPosition(numbers, 3));

        System.out.println();
        System.out.println("List reversed: " + reversOrder(numbers));

        numbers.add(7, 8);

        System.out.println("Add the first element: " + appendFirstElement(numbers, 30));

        System.out.println();
        System.out.println("First and last occurrence for value 8 is at index: ");
        firstAndLastOccurrence(numbers, 8);

        removeElement(numbers, 9);
        numbers.remove(0);
        numbers.remove(numbers.size() - 1);
    }

    public static LinkedList<Integer> initializeList() {
        LinkedList<Integer> list = new LinkedList<>();

        for (int index = 0; index < 10; index++) {
            list.add(index);
        }
        return list;
    }

    public static void printList(LinkedList<Integer> list) {
        int index = 0;
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println("Element: " + element + " index: " + index);
            index++;
        }
    }

    public static LinkedList<Integer> appendFirstElement(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        return list;
    }

    public static LinkedList<Integer> appendLastElement(LinkedList<Integer> list, int value) {
        list.addLast(value);
        return list;
    }

    public static LinkedList<Integer> startSpecifiedPosition(LinkedList<Integer> list, int value) {
        LinkedList<Integer> result = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(value);

        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    public static LinkedList<Integer> reversOrder(LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public static void firstAndLastOccurrence(LinkedList<Integer> list, int searchedElement) {
        ListIterator<Integer> iterator = list.listIterator();
        int firstOccurrence = -1;

        while (iterator.hasNext()) {
            if (iterator.next().equals(searchedElement)) {
                firstOccurrence = iterator.previousIndex();
                break;
            }

        }
        if (firstOccurrence != -1) {

            System.out.println("First occurrence at index " + firstOccurrence);
        }

        iterator = list.listIterator(list.size());
        int lastOccurrence = -1;

        while (iterator.hasPrevious()) {
            if (iterator.previous().equals(searchedElement)) {
                lastOccurrence = iterator.nextIndex();
                break;
            }

        }
        if (lastOccurrence != -1) {

            System.out.println("Last occurrence at index " + lastOccurrence);
        }
    }

    public static void removeElement(LinkedList<Integer> list, int value) {
        list.remove(value);
    }
}
