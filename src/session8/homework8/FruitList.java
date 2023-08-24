package session8.homework8;

import java.util.ArrayList;
import java.util.List;

//Create an ArrayList containing names of fruits.
// Implement a custom sorting mechanism to arrange them in descending order based on their length.
// If two fruits have the same length, sort them in alphabetical order.
public class FruitList {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("orange");
        fruitList.add("apple");
        fruitList.add("blackberry");
        fruitList.add("lemon");

        sortingFruitList(fruitList);
    }

    public static void sortingFruitList(List<String> list) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int index = 0; index < list.size() - 1; index++) {
                if (list.get(index).length() > list.get(index + 1).length()) {
                    String aux = list.get(index);
                    list.set((index), list.get(index + 1));
                    list.set((index + 1), aux);

                    isSorted = false;
                } else if (list.get(index).length() == list.get(index + 1).length()) {
                    isSorted = true;
                    if ((list.get(index).compareTo(list.get(index + 1))) > 0) {
                        String aux = list.get(index);
                        list.set((index), list.get(index + 1));
                        list.set((index + 1), aux);
                    }
                }
            }
            System.out.println(list);
        }
    }

}
