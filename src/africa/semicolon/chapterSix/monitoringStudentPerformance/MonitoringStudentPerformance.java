package africa.semicolon.chapterSix.monitoringStudentPerformance;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudentPerformance {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scan = new Scanner(System.in);
    private int numberOfcorrectAnswers =0;
    private int count = 0;
    private int percentage;



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
            int randomPick = 1 + random.nextInt(4);
            switch(randomPick){
                case 1 -> System.out.println("No please try again");
                case 2 -> System.out.println("Wrong, try once more");
                case 3 -> System.out.println("Don't give up!");
                case 4 -> System.out.println("No keep trying");
            }
            System.out.printf("How much is %d time %d -> ", randomNum1, randomNum2);
            userInput = scan.nextInt();
        }
        int correct = checkCorrectAnswer(userInput, randomNum1, randomNum2);
//        System.out.println(correct);
    }

    private int checkCorrectAnswer(int userInput, int randomNum1, int randomNum2) {
            numberOfcorrectAnswers++;

            int randomPick = 1 + random.nextInt(4);
            switch(randomPick){
                case 1 -> System.out.println("Very good");
                case 2 -> System.out.println("Excellent");
                case 3 -> System.out.println("nice work!");
                case 4 -> System.out.println("Keep up the good work");
            }
        return numberOfcorrectAnswers;
    }

    private void calculateAverage(int numberOfcorrectAnswers) {
         percentage = numberOfcorrectAnswers * 100 / 10;
        System.out.println(percentage);

        if (percentage > 75) System.out.println("Congratulations, you are ready to go to the next level!");
        else System.out.println("Please ask your teacher for extra help.");
        startGame();
    }

    public void displayAverage(){
        System.out.printf("You scored %d%% %n", numberOfcorrectAnswers * 100 / 10);
        calculateAverage(numberOfcorrectAnswers);
    }

}
