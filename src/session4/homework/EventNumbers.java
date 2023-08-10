package session4.homework;

public class EventNumbers {
    public static void main(String[] args) {

        for (int index1 = 1; index1 <= 10; index1++) {
            System.out.println("The numbers are: " + index1);

        }

        for (int index2 = 2; index2 <= 10; index2++) {
            if (index2 % 2 == 0) {
                System.out.println("The event numbers are: " + index2);
            }
        }
    }
}
