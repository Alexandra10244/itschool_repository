package session4.homework;

public class MaximumValue {

    public static void main(String[] args) {
        int heightOne = 12;
        int heightTwo = 16;
        int maximumHeight = 0;

        if (heightOne > heightTwo) {
            maximumHeight = heightOne;
        } else {
            maximumHeight = heightTwo;
        }
        System.out.println("The maximum height is equals to: " + maximumHeight);
    }

}
