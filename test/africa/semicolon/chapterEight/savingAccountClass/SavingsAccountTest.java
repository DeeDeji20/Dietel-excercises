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
    }
}