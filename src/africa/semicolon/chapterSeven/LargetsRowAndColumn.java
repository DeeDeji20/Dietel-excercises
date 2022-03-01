package africa.semicolon.chapterSeven;

import java.security.SecureRandom;

public class LargetsRowAndColumn {
    public static void main(String[] args) {
//        fill up a 4x4 array wit random values of 0s nd 1s
        int[][] array = new int[4][4];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] =  random.nextInt(2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

//        loop through each row while uming up all the integers
        int highestSum = 0;
        int sum;
        int index =0;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
            if (sum > highestSum) {
                highestSum = sum;
                index = i;
            }
        }
        System.out.println("Row "+ index+ "has the highest sum with "+ highestSum);
//          check at each sum for the largest... if the current sum is greater than the saved sum replace wit the highest sum
    }
}
