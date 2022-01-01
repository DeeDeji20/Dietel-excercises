package africa.semicolon.chapterSeven.variablelengthArgs;

import java.util.Arrays;
import java.util.Scanner;

public class VariableLengthArgs {
    public static void main(String[] args) {
            System.out.println("The product is: "+ calculateProductOfVargs(2, 3, 10));
            System.out.println("The product is: " + calculateProductOfVargs());
    }

    private static int calculateProductOfVargs(int... numbers) {
        if (numbers.length == 0) return 0;
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
