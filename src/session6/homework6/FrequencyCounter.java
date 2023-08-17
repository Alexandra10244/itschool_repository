package session6.homework6;

public class FrequencyCounter {
    public static void main(String[] args) {
        String sentence = "Hello word";

        stringCounter(sentence);

    }

    public static void stringCounter(String input) {
        StringBuilder word = new StringBuilder(input);

        for (int index = 0; index < word.length(); index++) {
            char letters = word.charAt(index);
            int counter = 1;

            for (int index2 = index + 1; index2 < word.length(); index2++) {
                if (letters == word.charAt(index2)) {
                    counter++;
                    word.deleteCharAt(index2);
                    index2--;
                }

            }
            System.out.println("'" + letters + "'  appers "+ counter+" time/times");
        }
    }
}
