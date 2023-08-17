package session6.homework6;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateMultipleStrings {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        list.add("Ana");
        list.add(" ");
        list.add("are");
        list.add(" ");
        list.add("mere");
        list.add("!");
        for (String element : list) {
            stringBuilder.append(element);
        }
        System.out.println(stringBuilder.toString());
    }
}
