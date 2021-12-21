package africa.semicolon.handsOn;

import java.security.SecureRandom;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array =new int[10];
        int length =array.length;
        System.out.println(length);
        for (int counter =1; counter <=6; counter++){
            ++array[1+ random.nextInt(6)];
//            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }

//    public static void main(String[] args) {
//        String[] namesOfNoiseMaker ={"Lotachukwu", "Shola", "Ibrahim", "Olamilekan"};
//
////        System.out.println(Arrays.toString(namesofNoiseMaker));
//        for(int i= 0; i< namesOfNoiseMaker.length; i++){
//            String names = namesOfNoiseMaker[i];
//            System.out.println(names);
//        }
//    }
}
