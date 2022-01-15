package africa.semicolon.chapterSix.computerInstructionDifficultyLevels;

import java.security.SecureRandom;
import java.util.Scanner;

public class DifficultyLevel {
    private static final Scanner scan = new Scanner(System.in);
    private static final SecureRandom random = new SecureRandom();
    public int promptUserForDifficultyLevel(String msg) {
        System.out.println(msg);
        return scan.nextInt();
    }

    public void displayQuestionBasedOnDifficultyLevel(int difficultyLevel) {
        if (difficultyLevel == 1) singleDigitNumbers();
        if (difficultyLevel == 2) doubleDigitNumbers();
    }

    private void doubleDigitNumbers() {
        int randomNum1 = 11 + random.nextInt(20);
        int randomNum2  = 11 + random.nextInt(20);
        int answer = promptUserForQuestion(randomNum1, randomNum2);
        checkUserAnswer(answer, randomNum1, randomNum1);
    }

    private void singleDigitNumbers() {
        int randomNum1 = 1 + random.nextInt(10);
        int randomNum2  = 1 + random.nextInt(10);
        int answer = promptUserForQuestion(randomNum1, randomNum2);
        checkUserAnswer(answer, randomNum1, randomNum1);
    }

    private void checkUserAnswer(int answer, int randomNum1, int randomNum2) {
        while (answer != randomNum1 * randomNum2){
            System.out.println("Wrong");
            answer = promptUserForQuestion(randomNum1, randomNum2);
        }
        if (answer == randomNum1 * randomNum2) {
            int randomPick = 1 + random.nextInt(4);
            switch(randomPick){
                case 1 -> System.out.println("Very good");
                case 2 -> System.out.println("Excellent");
                case 3 -> System.out.println("nice work!");
                case 4 -> System.out.println("Keep up the good work");
            }
        }
    }

    private int promptUserForQuestion( int randomNum1, int randomNum2) {
        System.out.println("How much is " + randomNum1 + "times" + randomNum2);
        return scan.nextInt();
    }
}
