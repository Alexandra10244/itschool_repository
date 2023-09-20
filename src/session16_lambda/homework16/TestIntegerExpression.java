package session16_lambda.homework16;

import java.util.List;

public class TestIntegerExpression {
    //Create a functional interface that takes a list of integers and returns the maximum value from the list.
    // Implement this interface using a lambda expression.
    // Ensure your lambda correctly handles an empty list case.

    public static void main(String[] args) {

        IntegerExpression findMax = (numbers -> {
            if (numbers.isEmpty()) {
                System.out.println("The list is empty");
            }
            int maxValue = numbers.get(0);
            for (int number : numbers) {
                if (number > maxValue) {
                    maxValue = number;
                }

            }
            return maxValue;
        });
        List<Integer> numbers = List.of(89, 32, 100, 4);
        int max = findMax.findMaxValue(numbers);
        System.out.println("Max value: " + max);
    }

}
