package africa.semicolon.chapterFour.creditLimitCalc;

import java.util.Scanner;
/*
    Declare variables account number, balance at the beginning of the month, totalcharged at thr brginning of minth, total of all credits, allowed credit limit
    prompt user to input the all the needed values
    calculate adnd display the new balance after deducting credit
    Determine if balance exceeds credit limit
        if balance exceed credit limit display credit limit exceeded
*/
public class CreditLimitCalculator {
    public static void main(String[] args) {
        long accountNumber;
        double balance;
        double chargePerMonth;
        double credit;
        double allowedCreditLimit;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your account number: ");
        accountNumber =scan.nextLong();

        System.out.println("Enter your balance: ");
        balance = scan.nextDouble();

        System.out.println("Enter charge per month: ");
        chargePerMonth = scan.nextDouble();

        System.out.println("Enter credit: ");
        credit = scan.nextDouble();

        System.out.println("Enter credit limit");
        allowedCreditLimit = scan.nextDouble();

        double newBalance = balance + chargePerMonth - credit;
        System.out.printf("Account %d has new balance of %.2f%n",accountNumber, newBalance);
        if(newBalance > allowedCreditLimit){
            System.out.println("Credit limit exceeded");
        }else{
            System.out.println("You are still within your credit limit");
        }
    }

}
