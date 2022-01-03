package africa.semicolon.chapterSeven.rollingDice;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random random  = new Random();
        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);

        int sum = calculateSumOfTwoDice(dice1, dice2);
        int[] outcomes =  checkNmberOfTimesOfPossibleSum(sum);
        displayOutcome();
    }

    private static int[] checkNmberOfTimesOfPossibleSum(int sum) {
        int[] outcome = new int[12];
//        if (sum == )
        return outcome;
    }

    private static void displayOutcome() {

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= 6; j++) {
//                if (i == 1) System.out.println(j + " ");
                System.out.printf("\t%d", j);
//            System.out.println(i);
            }
            System.out.println();
            for (int j = 1; j <= 6; j++) {
                System.out.println(j);
            }
        }
    }

    private static int calculateSumOfTwoDice(int roll1, int roll2) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = roll1 + roll2;
        }
        return sum;
    }
}
