package africa.semicolon.chapterSeven.practice;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int[] value : matrix) {
            Arrays.fill(value, 1);
        }
        int total =0;
        for (int[] values : matrix) {
            for (int value : values) {
                total+= value;
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println(total);
    }
}
