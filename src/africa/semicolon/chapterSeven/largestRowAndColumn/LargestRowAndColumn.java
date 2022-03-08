package africa.semicolon.chapterSeven.largestRowAndColumn;

import java.security.SecureRandom;

public class LargestRowAndColumn {
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
        int highestRowSum = Integer.MIN_VALUE;
        int index1 =0;
        for (int i = 0; i < array.length; i++) {
            int sum=0;
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
            if (sum > highestRowSum) {
                highestRowSum = sum;
                index1 = i;
            }

        }
        System.out.println("Row "+ index1+ " has the highest sum with "+ highestRowSum);
//          check at each sum for the largest... if the current sum is greater than the saved sum replace wit the highest sum

        int highestColumnSum = Integer.MIN_VALUE;
        int index2 =0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += array[i][j];
//                System.out.println(array[i][j]);
            }

            if (sum > highestColumnSum){
                highestColumnSum = sum;
                index2 = i;
            }
        }
        System.out.println("Column "+ index2+ " has the highest sum with "+ highestColumnSum);

    }
}
