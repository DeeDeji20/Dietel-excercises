package bank;

import java.util.Objects;

public class Account {
    private String name;
    private  String pin;
    private int balance = 50_000;
    public Account(String customerName, String customerPin) {
        name = customerName;
        pin = customerPin;
    }

    public String getAccountName() {
        return name;
    }

    public int getBalance(String myPin) {
        if (myPin.equals(pin)) return balance;
        return 0;
    }

    public void deposit(int amount) {
        if (amount > 0) balance+=amount;
    }

    public void withdrawAmount(int amountToWithdraw, String myPin) {
        if (amountToWithdraw >0 && myPin.equals(pin) && amountToWithdraw < balance) balance -= amountToWithdraw;

    }
}
