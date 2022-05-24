package africa.semicolon.handsOnExercises;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        mySort(1,0,2,0,1,2,0,1,2,0);
    }

    private static void mySort(int... array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
