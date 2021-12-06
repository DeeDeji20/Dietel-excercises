package bank;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static Account deesAccount;
    public static void main(String[] args) {
        initialPrompt();
    }

    public static void initialPrompt() {
        String prompt = """
                1.Create Account
                2. Exit             
                """;

        int userInput = input(prompt);
        if (userInput == 1){
            createAccount();
            accountOption();
        }
        System.exit(0);
    }

    private static void accountOption() {
        do {
            String secondPrompt = """
                1.Deposit
                2. Withdraw
                3. Check balance
                4. go back
                5. Exit          
                """;
            int userOption = input(secondPrompt);
            if (userOption == 1){
                int amount = input("Enter amount to deposit");
                deesAccount.deposit(amount);
            }else
            if (userOption ==2){
                int amountToWithdraw = input("How much do you want to withdraw");
                scan.nextLine();
                display("What is your pin");
                String userPin = scan.nextLine();
                deesAccount.withdrawAmount(amountToWithdraw, userPin);
            }else
            if (userOption == 3){
                display("Enter your pin");
                scan.nextLine();
                String enteredPin = scan.nextLine();
                int myBalance =deesAccount.getBalance(enteredPin);
                System.out.println(myBalance);
            }else
            if (userOption == 4){
                initialPrompt();
            }else
                System.exit(0);
        }while (true);

    }

    public static void createAccount() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account name");
        String accountName = scan.nextLine();

        System.out.println("Enter your pin");
        String accountPin = scan.nextLine();
        deesAccount = new Account(accountName, accountPin);
        System.out.println("Your account has been created");
    }
    public static void display(String message) {
        System.out.println(message);
    }
    public static int input(String prompt) {
        display(prompt);
        return scan.nextInt();
    }
}
