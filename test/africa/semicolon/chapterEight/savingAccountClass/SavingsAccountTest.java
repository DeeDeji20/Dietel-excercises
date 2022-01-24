package africa.semicolon.chapterEight.savingAccountClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    SavingsAccount savingsAccount = new SavingsAccount();
    @BeforeEach
    void setUp(){
        savingsAccount = new SavingsAccount();
    }

    @Test
    public void checkThatClassExists(){
        assertNotNull(savingsAccount);
    }

    @Test
    public void testThatMonthlyIncomeInterestCanCalculated(){
        savingsAccount.calculateMonthlyInterest();
        double savings = savingsAccount.getSavingsBalance();
        assertEquals(100.41666666666667, savings);
    }


    @Test
    public void testThatAnnualInterestRateCanBeModified(){
        SavingsAccount.modifyInterestRate(0.06);
        double annualInterestRate =SavingsAccount.getAnnualInterestRate();
        assertEquals(0.06, annualInterestRate);
    }
}