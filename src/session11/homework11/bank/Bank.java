package session11.homework11.bank;

public abstract class Bank {

    public abstract int getBalance();
}

class BankA extends Bank {

    @Override
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank {

    @Override
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {

    @Override
    public int getBalance() {
        return 200;
    }
}