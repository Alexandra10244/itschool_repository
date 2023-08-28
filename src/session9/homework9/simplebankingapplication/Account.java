package session9.homework9.simplebankingapplication;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountHolderName;
    private double initialDeposit;
    private double withdrawal;
    private double balance;

    public List<Double> transactions;

    public Account(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.initialDeposit = initialDeposit;
        this.transactions = new ArrayList<>();
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account holder name: " + accountHolderName +
                " Initial balance = " + initialDeposit + " Balance = " + balance;
    }

    public void addTransaction(double transaction) {
        transactions = new ArrayList<>(transactions);
        transactions.add(transaction);

    }

    public void withdrawalRequest(double withdrawal) {
        double initialBalance = initialDeposit;
        balance += initialBalance;
        if (withdrawal <= balance) {
            balance -= withdrawal;
            transactions.add(-withdrawal);
            System.out.println("Whitrdawal " + withdrawal);
        } else if (withdrawal > balance) {
            System.out.println("You don't have enough money for this withdrawal");
        }
    }

    public void depositMade(double deposit) {
        if (deposit != 0 && deposit > 0) {
            balance += deposit;
            transactions.add(+deposit);
            System.out.println("Deposit: " + deposit);
        }
    }

    public List getTransactions() {
        return transactions;
    }

}
