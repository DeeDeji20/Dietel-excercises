package africa.semicolon.chapterThree.account;

import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account details");

        Account myNewAccount = new Account("Adeola", 0.0);
        Account esthersAccount = new Account("Esther", 150.0);

        displayAccount(myNewAccount, 50, 70);
        displayAccount(esthersAccount, 0, 70);
    }
    public static void displayAccount(Account accountToDisplay, double amountToCredit, double amountToWithdraw){
        accountToDisplay.setAmountToCredit(amountToCredit);
        accountToDisplay.withdraw(amountToWithdraw);
        double accountBalance = accountToDisplay.getBalance();
        System.out.println(accountBalance);
        System.out.println(accountToDisplay.getName());

    }
}
