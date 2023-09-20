package session16_lambda.homework16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderListWithLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mihai", "Thomas", "Bob");
        sortingList(names);

    }

    public static void sortingList(List<String> names) {
        Collections.sort(names);
        names.forEach(name -> System.out.print(name + " "));
    }
}
