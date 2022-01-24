package africa.semicolon.chapterEight.savingAccountClass;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(2000);
        SavingsAccount savingsAccount2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);

        savingsAccount1.calculateMonthlyInterest();
        double savings1 = savingsAccount1.getSavingsBalance();
        System.out.printf("%.2f%n", savings1);

        savingsAccount2.calculateMonthlyInterest();
        double savings2 = savingsAccount2.getSavingsBalance();
        System.out.printf("%.2f%n", savings2);
    }
}
