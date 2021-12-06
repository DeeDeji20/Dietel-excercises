package africa.semicolon.chapterThree.account;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0) this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public void setName(String myName){
        name = myName;
    }

    public double getBalance(){
        return balance;
    }

    public void setAmountToCredit(double amountToCredit){
        if(amountToCredit > 0.0) balance += amountToCredit;
    }

    public void withdraw(double amountToWithdraw){
        if(amountToWithdraw < balance)
            balance -= amountToWithdraw;
        else
            System.out.println("Insufficient balance, withdrawal amount exceed balance");
    }
}
