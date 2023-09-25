package session17_streamsAndOptional.homework17;

import java.util.stream.IntStream;

public class PrimeNumbers {
    //Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.

    public static void main(String[] args) {

        IntStream numbers = IntStream.rangeClosed(1, 100);

        IntStream primeNumbers = numbers.filter(PrimeNumbers::isPrime);

        primeNumbers.forEach(System.out::println);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int index = 5; index * index <= number; index += 6) {
            if (number % index == 0 || number % (index + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}

