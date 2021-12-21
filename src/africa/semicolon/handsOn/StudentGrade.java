package africa.semicolon.handsOn;

import java.util.Arrays;
import java.util.Scanner;

/*
* ask user to enter 10 scores
* print the scores
* find the average
* find the min and max score
* find the total of all scores
* */
public class StudentGrade {
    public static void main(String[] args) {
        int score =0;
        int sum=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] scoreCollector  = new int[5];

        for (int i=0; i< scoreCollector.length; i++){
            System.out.println("Enter a score");
            Scanner scan = new Scanner(System.in);
            score = scan.nextInt();
            scoreCollector[i] = score;
            sum+= score;

            if (score < min){
                min= score;
            }
            if (score > max){
                max = score;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println((double)sum/10);

        for (int i : scoreCollector) {
            System.out.print(i + " ");
        }

    }


}
