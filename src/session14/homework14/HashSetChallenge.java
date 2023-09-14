package session14.homework14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetChallenge {

    public static void main(String[] args) {

        HashSet<Integer> firstSet = initializeHSet();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        HashSet<Integer> secondSet = initializeHSet();
        secondSet.add(5);
        secondSet.add(6);
        secondSet.add(7);

        int lastElement = 4;
        firstSet.add(lastElement);

        printSet(firstSet);
        System.out.println();

        System.out.println("Size: " + firstSet.size());

        System.out.println("Remove all the elements: " + secondSet.removeAll(secondSet));
        System.out.println("The set is empty: " + secondSet.isEmpty());

        HashSet<Integer> cloneSet = (HashSet<Integer>) firstSet.clone();
        printSet(cloneSet);

        System.out.println();
        System.out.println("Convert a hash set to an array");
        covertToArray(firstSet);

        System.out.println("Convert a hash set to an array list");
        ArrayList<Integer> arrayList = new ArrayList<>(secondSet);
        System.out.println(arrayList);

        System.out.println("Convert a hash set to an TreeSet");
        TreeSet<Integer> treeSet = new TreeSet<>(firstSet);
        System.out.println(treeSet);
    }

    public static HashSet<Integer> initializeHSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int element : set) {
            set.add(element);
        }
        return set;
    }

    public static void printSet(HashSet<Integer> set) {
        for (int element : set) {
            System.out.print(element + " ");
        }
    }

    public static void covertToArray(HashSet<Integer> set) {

        int[] array = new int[set.size()];
        int index = 0;
        for (Integer element : set) {
            array[index++] = element;
        }

        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
