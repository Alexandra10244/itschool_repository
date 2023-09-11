package session11.homework11.bank;

import session11.homework11.bank.BankA;
import session11.homework11.bank.BankB;
import session11.homework11.bank.BankC;

public class MainBank {

    //Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively.
    // 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
    // Call this method by creating an object of each of the three classes.

    public static void main(String[] argas) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Deposit bank A: " + bankA.getBalance());
        System.out.println("Deposit bank B: " + bankB.getBalance());
        System.out.println("Deposit bank C: " + bankC.getBalance());

    }
}
