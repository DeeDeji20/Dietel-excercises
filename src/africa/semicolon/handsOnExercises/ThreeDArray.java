package africa.semicolon.handsOnExercises;

import java.security.SecureRandom;
import java.util.Arrays;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] threeD =new int[3][3][3];
        SecureRandom random = new SecureRandom();


        for (int i = 0; i < threeD.length; i++) {
//            int securNumber = 10 + random.nextInt(50);
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
//                    System.out.print(threeD[i][j][k] + " ");
                    System.out.print(Arrays.deepToString(threeD));
                }
            }
            System.out.println();

        }
    }
}
