package session9.homework9.simplebankingapplication;

import java.util.List;

public class CheckTheAccountBalance {

    public static void main(String[] args) {

        Account account = new Account("Popescu Alin", 1000);
        account.depositMade(500);
        account.withdrawalRequest(100);
        System.out.println(account);
        System.out.println("Transactions: " + account.getTransactions());

    }
}
