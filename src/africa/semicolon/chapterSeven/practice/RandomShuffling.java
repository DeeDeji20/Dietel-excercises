package africa.semicolon.chapterSeven.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RandomShuffling {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 5}, {3, 6, 9}, {1, 5, 7}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int rand1 = (int)(Math.random() * array.length);
                int rand2 = (int)(Math.random() * array[i].length);

                int temp = array[i][j];
                array[i][j] = array[rand1][rand2];
                array[rand1][rand2] = temp;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
