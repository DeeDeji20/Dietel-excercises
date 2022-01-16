package africa.semicolon.chapterSix.varyingTypeOfProblems;

import java.security.SecureRandom;
import java.util.Scanner;

public class VaryingProblemTypes {
    private final Scanner scan = new Scanner(System.in);
    private final SecureRandom random = new SecureRandom();
    private final int randomNum1 = 1 + random.nextInt(10);
    private final int randomNum2  = 1 + random.nextInt(10);
    int difficultyLevel;
    int randomPick;
    public void startGame() {
        difficultyLevel = promptUserForDifficultyLevel("Enter difficulty level(1.+, 2.-, 3.*, 4./): ");
        displayQuestionBasedOnDifficultyLevel(difficultyLevel);
    }

    private void displayQuestionBasedOnDifficultyLevel(int difficultyLevel) {
        if (difficultyLevel == 1) displayAdditionQuestion();
        if (difficultyLevel == 2) displaySubtractionQuestion();
        if (difficultyLevel == 3) displayMultiplicationQuestion();
        if (difficultyLevel == 4) displayDivisionQuestion();
        if (difficultyLevel == 5) displayRandomMixtureQuestion();
    }

    private void displayRandomMixtureQuestion() {
        int answer = promptUserForQuestion(randomNum1, randomNum2);
        checkUserAnswer(answer, randomNum1, randomNum2);
    }

    private void displayDivisionQuestion() {
        randomPick = 1 + random.nextInt(4);
        switch (randomPick){
            case 1 -> displayAdditionQuestion();
            case 2 -> displaySubtractionQuestion();
            case 3 -> displayMultiplicationQuestion();
            case 4 -> displayDivisionQuestion();
        }
    }

    private void displayMultiplicationQuestion() {
        int answer = promptUserForQuestion(randomNum1, randomNum2);
        checkUserAnswer(answer, randomNum1, randomNum2);
    }

    private void displaySubtractionQuestion() {
        int answer = promptUserForQuestion(randomNum1, randomNum2);
        checkUserAnswer(answer, randomNum1, randomNum2);
    }

    private void displayAdditionQuestion() {
        int answer = promptUserForQuestion(randomNum1, randomNum2);
        checkUserAnswer(answer, randomNum1, randomNum2);
    }

    private void checkUserAnswer(int answer, int randomNum1, int randomNum2) {
        if (difficultyLevel == 1 || (difficultyLevel == 5 && randomPick == 1) && answer == randomNum1 + randomNum2){
            System.out.println("Correct");
        }else if (difficultyLevel == 2 || (difficultyLevel == 5 &&   randomPick == 2) && answer == randomNum1 - randomNum2){
            System.out.println("Correct");
        }else if (difficultyLevel == 3 || (difficultyLevel == 5 &&  randomPick == 3) && answer == randomNum1 * randomNum2){
            System.out.println("Correct");
        }else if (difficultyLevel == 4 || (difficultyLevel == 5 &&  randomPick == 4) && answer == randomNum1 / randomNum2){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }
    }

    private int promptUserForQuestion(int randomNum1, int randomNum2) {
        if (difficultyLevel == 1 || (difficultyLevel == 5 && randomPick == 1)) System.out.println("How much is " + randomNum1 + " + " + randomNum2);
        if (difficultyLevel == 2 || (difficultyLevel == 5 && randomPick == 2)) System.out.println("How much is " + randomNum1 + " - " + randomNum2);
        if (difficultyLevel == 3 || (difficultyLevel == 5 && randomPick == 3)) System.out.println("How much is " + randomNum1 + " * " + randomNum2);
        if (difficultyLevel == 4 || (difficultyLevel == 5 && randomPick == 4))System.out.println("How much is " + randomNum1 + " / " + randomNum2);
        else System.out.println("hi");
        return scan.nextInt();
    }

    private int promptUserForDifficultyLevel(String msg) {
        System.out.println(msg);
        return scan.nextInt();
    }

}
