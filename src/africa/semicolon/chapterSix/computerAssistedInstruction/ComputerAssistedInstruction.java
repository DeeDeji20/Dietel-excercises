package africa.semicolon.chapterSix.computerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scan = new Scanner(System.in);

    public void startGame() {
        int randomNum1 = generateRandomNumbers1();
        int randomNum2  = generateRandomNumbers2();
        checkResponse(randomNum1, randomNum2);
    }

    private static int generateRandomNumbers2() {
        return 1+ random.nextInt(12);
    }

    private static int generateRandomNumbers1() {
        return 1+ random.nextInt(12);
    }

    private void checkResponse(int randomNum1, int randomNum2) {
        System.out.printf("How much is %d time %d -> ", randomNum1, randomNum2);
        int userInput = scan.nextInt();
        while(userInput != randomNum1 * randomNum2){
            System.out.println("Wrong");
            System.out.printf("How much is %d time %d -> ", randomNum1, randomNum2);
            userInput = scan.nextInt();
        }
        checkCorrectAnswer(userInput, randomNum1, randomNum2);
    }

    private void checkCorrectAnswer(int userInput, int randomNum1, int randomNum2) {
        while (userInput == randomNum1*randomNum2){
            System.out.println("Congratulations");
            System.out.println("Would you like to continue the game?");
            scan.nextLine();
            String response = scan.nextLine();
            if (response.toUpperCase().charAt(0) == 'Y'){
                startGame();
                System.out.printf("How much is %d time %d -> ", randomNum1, randomNum2);
                userInput = scan.nextInt();
            }else System.exit(0);
        }
    }
}
