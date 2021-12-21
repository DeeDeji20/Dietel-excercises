package africa.semicolon.handsOn;

import java.util.Arrays;

public class RandomValuesInArrays {
    public static void main(String[] args) {
        double[] myArray = new double[10];
        for (int value = 0; value < myArray.length; value++) {
            myArray[value] = Math.random()*10;
        }
        for (double value : myArray) {
            System.out.printf("%.1f ", value);
        }
    }
}
