package session8.practice;

public class WrapperClasses {

    public static void main(String[] args) {
        int number = 10;
        Integer number2 = Integer.valueOf(number);
        Integer autoboxedNumber = 10;

        String randomNumber = "12";
        Integer randomNumberAsInteger = Integer.parseInt(randomNumber);

        printRaundedNumber("43.36");
    }

    public static void printRaundedNumber(String number) {
        Double doubleNumber = Double.parseDouble(number);
        long rounderNumber = Math.round(doubleNumber);
        System.out.println(rounderNumber);
    }
}
