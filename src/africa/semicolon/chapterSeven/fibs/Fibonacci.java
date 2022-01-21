package africa.semicolon.chapterSeven.fibs;

import java.util.Arrays;

public class Fibonacci {
    private static final int[] series =  new int[31];
    public static void main(String[] args) {
        fibonacci(31);
        System.out.println(Arrays.toString(series));
    }

    private static void fibonacci(int value) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < series.length; i++) {
            n3 = n1 + n2;
            series[i] = n3;
            n1 = n2;
            n2 = n3;
        }
    }
}
