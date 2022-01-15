package africa.semicolon.chapterSix.monitoringStudentPerformance;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudentPerformance {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scan = new Scanner(System.in);
    private int numberOfCorrectAnswers =0;

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
        if (userInput == randomNum1 * randomNum2) checkCorrectAnswer();
    }

    private void checkCorrectAnswer() {
        numberOfCorrectAnswers++;
        int randomPick = 1 + random.nextInt(4);
        switch(randomPick){
            case 1 -> System.out.println("Very good");
            case 2 -> System.out.println("Excellent");
            case 3 -> System.out.println("nice work!");
            case 4 -> System.out.println("Keep up the good work");
        }
    }

    private void calculateAverage(int numberOfcorrectAnswers) {
        int percentage = numberOfcorrectAnswers * 100 / 10;
        if (percentage > 75) System.out.println("Congratulations, you are ready to go to the next level!");
        else System.out.println("Please ask your teacher for extra help.");
    }

    public void displayAverage(){
        System.out.printf("You scored %d%% %n", numberOfCorrectAnswers * 100 / 10);
        calculateAverage(numberOfCorrectAnswers);
        numberOfCorrectAnswers = 0;
    }
}
