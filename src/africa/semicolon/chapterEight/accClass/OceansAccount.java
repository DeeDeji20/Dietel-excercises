package africa.semicolon.chapterEight.accClass;

import java.util.Date;

public class OceansAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public OceansAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public OceansAccount() {
        this(0, 0.0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate()/100);
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void deposit(double amount){
        balance  = balance + amount;
    }

    @Override
    public String toString() {
        return "OceansAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
