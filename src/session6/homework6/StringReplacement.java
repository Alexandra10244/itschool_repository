package session6.homework6;

public class StringReplacement {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String sentence = "Ana has a dog.";
        result.append(sentence);
        String replaceWord = "cat";

        System.out.println(result.toString());

        result.replace(10, 13, replaceWord);
        System.out.println(result.toString());


    }
}
