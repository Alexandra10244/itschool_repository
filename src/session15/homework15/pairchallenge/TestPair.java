package session15.homework15.pairchallenge;

import session15.homework15.PairChallenge;

public class TestPair {

    public static void main(String[] args) {
        PairChallenge<Integer, String> movie = new PairChallenge<>(2018, "IT");
        System.out.println(movie.getKey() + " " + movie.getValue());
    }
}
