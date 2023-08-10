package session4.homework;

public class TemperatureCheck {

    public static void main(String[] args) {

        int temperature = 24;

        if (temperature > 30) {
            System.out.println("Hot");

        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");

        } else {
            System.out.println("Cold");

        }
    }
}
