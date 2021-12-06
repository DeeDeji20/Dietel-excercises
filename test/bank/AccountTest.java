package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account myAccount = new Account("Adeola Oladeji", "0732");

    @Test
    public void accountCanBeCreatedTest(){
        String adeolaAccount = myAccount.getAccountName();
        assertEquals("Adeola Oladeji", adeolaAccount);
    }

    @Test
    public void accountHas50KWhenCreated(){
        int myBalance = myAccount.getBalance("0732");
        assertEquals(50_000, myBalance);
    }

    @Test
    public void depositCash(){
        myAccount.deposit(5_000);
        int myBalance = myAccount.getBalance("0732");
        assertEquals(55_000, myBalance);
    }

    @Test
    public void checkCannotDepositNegativeAmount(){
        myAccount.deposit(-5_000);
        int myBalance = myAccount.getBalance("0732");
        assertEquals(50_000, myBalance);
    }

    @Test
    public void withdrawCash(){
        myAccount.withdrawAmount(5_000, "0732");
        int myBalance = myAccount.getBalance("0732");
        assertEquals(45_000, myBalance);
    }

    @Test
    public  void cannotWithdrawNegativeAmountTest(){
        myAccount.withdrawAmount(-5000, "0732");
        int myBalance = myAccount.getBalance("0732");
        assertEquals(50_000, myBalance);
    }

    @Test
    public void cannotWithdrawMoreThanBalanceTest(){
        myAccount.withdrawAmount(55_000, "0732");
        int myBalance = myAccount.getBalance("0732");
        assertEquals(50_000, myBalance);
    }

    @Test
    public void cannotWithdrawWithWrongPinTest(){
        myAccount.withdrawAmount(55_000, "0739");
        int myBalance = myAccount.getBalance("0732");
        assertEquals(50_000, myBalance);
    }

}
