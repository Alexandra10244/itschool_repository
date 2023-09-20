package session16_lambda.practice;

import session16_lambda.practice.StringProcessor;

public class StringProcessorTest {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = str -> str.replace(" ", "");
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhiteSpaces.andThen(toUpperCase);
        System.out.println(combined.process("hello world"));

    }
}
