package africa.semicolon.chapterSeven.rollingDice;

import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random random  = new Random();
        int dice1 ;
        int dice2 ;
        int[] outcomes = new int[11];
        for (int position = 0; position < 36_000_000; position++) {
            dice1 = 1 + random.nextInt(6);
            dice2 = 1 + random.nextInt(6);
            int sum = calculateSumOfTwoDice(dice1, dice2);
            checkNmberOfTimesOfPossibleSum(sum, outcomes);
        }
        System.out.println(Arrays.toString(outcomes));
//        System.out.println(Arrays.toString(outcomesArray));
        tabularDisplay(outcomes);
//        displayOutcome(outcomes);
    }

    private static void tabularDisplay(int[] outcomes) {
        System.out.printf("%s\t%s%n", "SUM", "NUMBER OF TIMES");
        for (int position = 0; position < outcomes.length; position++) {
            System.out.printf("%d\t\t", position+2);
            System.out.println(outcomes[position]);
        }
    }

    private static void checkNmberOfTimesOfPossibleSum(int sum, int[] outcomes) {
        for (int position = 0; position < outcomes.length; position++) {
            if (sum == position+2){
                outcomes[position]++;
                break;
            }
        }
    }

    private static void displayOutcome() {
        int[] outcomesArray = {2,3,4,5,6,7,8,9,10,11,12};
            int a = 1;
            for (; a <= 6; a++) {
                System.out.printf("\t%d", a);
            }
            System.out.println();
            int b = 1;
            for (; b <= 6; b++) {
                System.out.print(b +"\t");

                for (int j = 1; j <= 6; j++) {
                    for (int k = 1; k <= 6; k++) {
                        if (k + j == outcomesArray[k-1]){
                            System.out.print(outcomesArray[k] + "\t");
                        }
                    }
                }
                    System.out.println();
            }
        }

    private static int calculateSumOfTwoDice(int roll1, int roll2) {
        return  roll1 + roll2;
    }
}
