package session16_lambda.practice;

import session16_lambda.practice.IntMultiply;
import session16_lambda.practice.IntSum;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        System.out.println(getSum.sum(3, 8));

        IntMultiply getMultiply = (a, b) -> a * b;
        System.out.println(getMultiply.multiply(5, 7));
    }
}
