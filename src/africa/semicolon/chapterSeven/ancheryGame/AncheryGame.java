package africa.semicolon.chapterSeven.ancheryGame;

import java.security.SecureRandom;

public class AncheryGame {
    public static void main(String[] args) {
        int[][] collections= new int[4][3];

        assignScores(collections);
        int sum = calculateTotalOfFirst(collections);
        printCollection(collections);
        checkWinner(collections, sum);
    }

    private static void checkWinner(int[][] collections, int sum) {
        int j = 0;
        for (; j < collections.length; j++) {
            int[] collection = collections[j];
            int total = 0;
            int i = 0;
            for (; i < collections[j].length; i++) {
                int value = collection[i];
                total += value;
            }
            if (total > sum) {
                sum = total;
                System.out.println("The winner of the game is player " + (j+1));
            }
//            else if(total == sum) System.out.println("There is a draw");
        }
//            System.out.println("sum: " + sum);
    }

    private static int calculateTotalOfFirst(int[][] collections) {
        int sum =0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < collections[0].length; j++) {
                sum+= collections[0][j];
            }
        }
        return sum;
    }

    private static void printCollection(int[][] collections) {
        String[] headings = {"Player no", "1st chance", "2nd chance", "3rd chance", "Total"};
        for (String heading : headings) {
            System.out.print(heading + "\t");
        }
        System.out.println();

        for (int i = 0; i < collections.length; i++) {
            System.out.print(i+1 +"\t\t\t");
            int sum =0;
            for (int j = 0; j < collections[i].length; j++) {
                sum += collections[i][j];
                System.out.print(collections[i][j] + "\t\t\t");
            }
                System.out.print(sum);
            System.out.println();
        }
    }

    private static void assignScores(int[][] collections) {
        for (int i = 0; i < collections.length; i++) {
            for (int j = 0; j < collections[i].length; j++) {
                SecureRandom random = new SecureRandom();
                int playerScore = random.nextInt(10);
                collections[i][j] = playerScore;
//                System.out.print(collections[i][j]);
            }
            System.out.println();
        }
    }
}
