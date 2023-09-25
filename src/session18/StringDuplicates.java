package session18;

import java.util.*;
import java.util.stream.Collectors;

public class StringDuplicates {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "apple", "plum", "orange");
        System.out.println(countStringDuplicates(list));
    }

    private static HashMap<String, Long> countStringDuplicates(List<String> input) {

        HashMap<String, Long> worldFrequencyMap = (HashMap<String, Long>) input.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        return worldFrequencyMap;
    }
}
