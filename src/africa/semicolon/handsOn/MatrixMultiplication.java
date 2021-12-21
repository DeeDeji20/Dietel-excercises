package africa.semicolon.handsOn;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1,1,1}, {2,2,2}, {3,3,3}};
        int[][] b = {{1,1,1}, {2,2,2}, {3,3,3}};
        int[][] result = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
            result[i][j] =0;

                for (int k = 0; k < b.length; k++) {
                    result[i][k] += a[k][i] * b[k][i];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
