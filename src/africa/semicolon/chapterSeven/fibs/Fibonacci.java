package africa.semicolon.chapterSeven.fibs;

import java.util.Arrays;

public class Fibonacci {
    private static final int[] series =  new int[31];
    public static void main(String[] args) {
        fibonacci(31);
        System.out.println(Arrays.toString(series));
    }

    private static void fibonacci(int value) {
        int y = 1;
        int x = 1;
        for (int i = 0; i < series.length; i++) {
            x= x+y;
            series[i] = x;
            y = x;
            if(i ==1){
                System.out.println(x);
                break;
            }
        }
    }
}
