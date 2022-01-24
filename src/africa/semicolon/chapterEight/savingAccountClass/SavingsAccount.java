package africa.semicolon.chapterEight.savingAccountClass;

public class SavingsAccount {
    private static double annualInterestRate = 0.05;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate)/12;
    }
}

