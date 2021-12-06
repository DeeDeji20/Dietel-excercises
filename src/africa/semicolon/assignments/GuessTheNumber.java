package africa.semicolon.assignments;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    private static final Scanner scan = new Scanner(System.in);
    private static int mysteryNumber;

    //1 generate random number
    // 2ask user for guess
    //if guess number == random number - display congrats $$$ ask to play again
    //if play again, goto 1
    //if guess numnber > random number - display too high $$$ goto 2
    //if guess number < random number - display too low $$$ goto 2

    public static void main(String... args) {
        mysteryNumber = generateRandomNumber();
        guess();


    }

    public static void guess() {
        int userGuess = input("Enter a number: ");
        if (userGuess == mysteryNumber) {
            display("Congrats");
            promptUserToStartAgain();
        }
        if (userGuess > mysteryNumber) display("Too High");
        if (userGuess < mysteryNumber) display("Too Low");
        redo();

    }

    private static void redo() {
        guess();
    }

    private static void promptUserToStartAgain() {
        display("Do you want to start again");
        String response = scan.next();
        boolean responseIsYes = response.toUpperCase().charAt(0) == 'Y';
        if (responseIsYes) main("");

    }

    private static void display(String message) {
        System.out.println(message);
    }

    private static int input(String prompt) {
        display(prompt);
        return scan.nextInt();
    }

    private static int generateRandomNumber() {
        SecureRandom randomNumber = new SecureRandom();
        return 1 + randomNumber.nextInt(10);
    }

}
//    public static void main(String[] args) {
//        matchGuess(randomNumberGuess(), userGuess());
//    }

//    public static int randomNumberGuess() {
//        SecureRandom randomNumber = new SecureRandom();
//        int randomValue = 1 + randomNumber.nextInt(10);
//        System.out.println(randomValue);
//        return randomValue;
//    }
//
//    public  static int userGuess(){
//        System.out.println("Guess a number");
//        return scan.nextInt();
//    }
//
//    public static void matchGuess(int generatedNumber, int userInput){
//        while (userInput != generatedNumber){
//            if(userInput > generatedNumber) System.out.println("Too high");
//            else System.out.println("Too low");
//
//            System.out.println("Enter another guess");
//            userInput = scan.nextInt();
//        }
//
//            System.out.println("congrats");
//            options();
//
//    }
//
//    public  static void options(){
//        String userOptions = """
//               1. Play again
//               2. Exit game
//               Enter your choice
//               """;
//        System.out.println(userOptions);
//        int choice = scan.nextInt();
//        switch (choice){
//            case 1-> matchGuess(randomNumberGuess(), userGuess());
//            case 2-> System.out.println("Thanks for playing");
//            default -> {
//                System.out.println("Incorrect choice, please re-enter your choice");
//                options();
//            }
//        }
//    }
//}
