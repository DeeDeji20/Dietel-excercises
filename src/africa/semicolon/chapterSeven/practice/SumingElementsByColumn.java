package africa.semicolon.chapterSeven.practice;

import java.util.Arrays;

public class SumingElementsByColumn {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int[] value : matrix) {
            Arrays.fill(value, 1);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                total+= matrix[i][j];
            }
                System.out.println("Sum for column " + i + " is " + total);
        }
    }
}
