package africa.semicolon.chapterEight.savingAccountClass;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate)/12;
    }
}

