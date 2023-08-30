package session10.homework10.bankaccountmanagementsystem;

import java.util.UUID;

public class BankAccount {

    private String accountHolderName;
    private UUID accountNumber;
    private double balance;


    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = UUID.randomUUID();
        this.balance = balance;
    }

    public void addDeposit(double deposit) {
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Deposit: " + deposit);
            System.out.println("Balance: " + balance);
        }
    }

    public void requestedWithdrwal(double withdrawal) {
        if (withdrawal > 0 && withdrawal < balance) {
            balance -= withdrawal;
            System.out.println("Withrawal of " + withdrawal + " Balance after the withdrawa: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        System.out.print("Current balance: ");
        return balance;
    }

    public String getAccountDetails() {
        return "Account hoolder: " + accountHolderName
                + "  Account number: " + accountNumber
                + " Balance: " + balance;
    }

}
