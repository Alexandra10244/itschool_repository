package session10.homework10.bankaccountmanagementsystem;

public class MainClass {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Pop Maria", 3000);
        System.out.println(bankAccount.getAccountDetails());
        bankAccount.addDeposit(200);
        System.out.println(bankAccount.getBalance());
        bankAccount.requestedWithdrwal(120);
        System.out.println(bankAccount.getBalance());
    }
}
