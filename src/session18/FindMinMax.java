package session18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 56, 89, 2);

        System.out.println("Max value = " + max(numbers));
        System.out.println("Min value = " + min(numbers));
    }

    private static int min(List<Integer> list) {
        Optional<Integer> minValue = list.stream().min(Integer::compareTo);

        return minValue.orElse(0);
    }

    private static int max(List<Integer> list) {
        Optional<Integer> maxValue = list.stream().max(Integer::compareTo);

        return maxValue.orElse(0);
    }
}
