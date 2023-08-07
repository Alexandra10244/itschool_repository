package session3;

public class AssignmentCompoundOperators {

    public static void main(String[] args) {


        int number = 15;
        number += 5;
        number = 5 + number;
        System.out.println("After adding 5: " + (number + number));

        number *= 2;
        System.out.printf("After multiply by 2: " + number);
    }
}
