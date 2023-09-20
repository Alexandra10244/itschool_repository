package session16_lambda.practice;

import session16_lambda.practice.GreetingService;

public class TestGreetingService {

    public static void main(String[] args) {

        //anonymous class
        GreetingService anontmousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello " + message);
            }
        };
        anontmousGreetingService.greet("Ionut");

        //lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello " + message);
        lambdaGreetingService.greet("Maria");
    }
}
