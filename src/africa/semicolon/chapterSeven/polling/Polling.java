package africa.semicolon.chapterSeven.polling;

import java.util.Arrays;
import java.util.Scanner;

public class Polling {
    private static String[] topics = {"Politics", "Entertainment", "Gender equality", "Religion", "Movies"};

    private static int[][] responses = new int[5][10];

    public static String[] getTopics() {
        return topics;
    }

    public static int[][] getResponses() {
        return responses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < topics.length; i++) {
            System.out.println("rate " + topics[i] + " from 1 to 10.");
            int response = scanner.nextInt();
            responses[i][response-1] = response;
        }
        int value=0;
        for (int j = 0; j < responses.length; j++) {
            System.out.print(topics[j]);
            System.out.print("\t\t");
            for (int k = 0; k < responses[j].length; k++) {
//                if (responses[j][k] >0 ){
//                    value = responses[j][k];
//                }
                System.out.print(responses[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }

//        String line = displayVerticalLine();
//        System.out.println(line);



    }

    public static String displayHorizontalLine(){
        String horizontalLines = "--".repeat(50);
        return horizontalLines;
    }

    public static String displayVerticalLine(){
        String verticalLines = "|\t\t" + "|\t".repeat(11);
        return verticalLines;
    }
}
