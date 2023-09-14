package session14.homework14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorArrayList {

    public static void main(String[] args) {

        System.out.println("Color1: ");
        ArrayList<String> colors1 = initializeList();

        System.out.println();
        colors1.add(0, "gray");
        printList(colors1);

        System.out.println();
        System.out.println("Third element from color1: " + colors1.get(2));

        System.out.println();
        System.out.println("Update element 4 from color1: ");
        System.out.println(updateList(colors1, 3, "white"));

        System.out.println();
        System.out.println("Remove element 3 from color1: ");
        colors1.remove(2);
        System.out.println(colors1);

        System.out.println("Red is in the list color1" + searchedElement(colors1, "red"));

        System.out.println("Sorted list color1: " + sortedList(colors1));

        ArrayList<String> colors2 = new ArrayList<>(colors1);
        System.out.println("List 2 of colors is equal to: " + colors2);

        System.out.println("Color2 shuffled: " + shuffleElements(colors2));

        System.out.println("Color1 revers: " + reversElements(colors1));

        System.out.println("Extract first 2 elements from color1: " + extractedPortionFromList(colors2, 0, 1));

        System.out.println("Colors1 is equal colors2: " + compareLists(colors1, colors2));

        System.out.print("Colors2: ");
        printList(colors2);
        System.out.println();
        System.out.println("Swap element 2 with element 3 form colors2: " + swapElements(colors2, 1, 2));

        System.out.println("Colors + colors2= " + joinTwoList(colors1, colors2));

        List<String> cloneList = new ArrayList<>(colors2);
        System.out.print("Colors2: ");
        printList(colors2);
        System.out.println();
        System.out.print("Clone list: ");
        printList(cloneList);

        System.out.println();
        empltyAList(cloneList);
        System.out.println("The clone list is empty: " + isListEmpty(cloneList));

        trimCapacityList(colors1);

        increaseSizeArray(colors2, 2);

    }

    public static ArrayList<String> initializeList() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("orange");
        colors.add("red");
        colors.add("blue");
        colors.add("black");

        for (String color : colors) {
            System.out.print(color + " ");
        }

        return colors;
    }

    public static void printList(List<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
    }

    public static List<String> updateList(List<String> list, int index, String value) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index");
            return list;
        }

        List<String> update = new ArrayList<>(list);
        update.set(index, value);
        return update;

    }

    public static boolean searchedElement(List<String> list, String value) {
        if (list.contains(value)) {
            return true;
        }
        return false;
    }

    public static List<String> sortedList(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static List<String> shuffleElements(List<String> list) {
        Collections.shuffle(list);
        return list;
    }

    public static List<String> reversElements(List<String> list) {
        Collections.reverse(list);
        return list;
    }

    public static List<String> extractedPortionFromList(List<String> list, int index1, int index2) {
        List<String> extractedElements = new ArrayList<>();
        for (int index = index1; index <= index2; index++) {
            String element = list.get(index);
            extractedElements.add(element);
        }
        return extractedElements;
    }

    public static boolean compareLists(List<String> list1, List<String> list2) {
        if (list1.equals(list2)) {
            return true;
        }
        return false;
    }

    public static List<String> swapElements(List<String> list, int index1, int index2) {
        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
            String element1 = list.get(index1);
            String element2 = list.get(index2);

            list.set(index1, element2);
            list.set(index2, element1);
        } else {
            System.out.println("Invalid index.");
        }
        return list;
    }

    public static List<String> joinTwoList(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        return list1;
    }

    public static void empltyAList(List<String> list) {
        list.removeAll(list);
    }

    public static boolean isListEmpty(List<String> list) {
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void trimCapacityList(ArrayList<String> list) {
        list.trimToSize();
    }

    public static void increaseSizeArray(ArrayList<String> list, int index) {
        list.ensureCapacity(index);
    }
}
