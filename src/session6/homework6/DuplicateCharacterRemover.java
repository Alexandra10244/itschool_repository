package session6.homework6;

public class DuplicateCharacterRemover {
    public static void main(String[] args) {
        String input = "tomorrow";
        System.out.println(findDuplicates(input));

    }

    public static String findDuplicates(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        //currentChar.append(input);
        for (int index = 0; index < stringBuilder.length(); index++) {
            char char1 = input.charAt(index);
            char char2 = input.charAt(index +1);
            if (index+1 < input.length() && char1 == char2) {
                stringBuilder.deleteCharAt(index+1);
            }
        }
        return stringBuilder.toString();
    }
}
