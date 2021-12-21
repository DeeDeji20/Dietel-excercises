package africa.semicolon.handsOn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCodeWar {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4};
        int num =6;
        twoSum(arr, num);
    }

    private static void twoSum(int[] arr, int num) {
         List<Integer> numbers = new ArrayList();

        int[] newArray = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num){
                    numbers.add(i);
                    numbers.add(j);
                }
            }
        }
        System.out.println(numbers);
    }
}
