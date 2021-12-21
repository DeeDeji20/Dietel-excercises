package africa.semicolon.chapterFive;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits to enter");
        int numberOfDIgits = scan.nextInt();
        int smallest =Integer.MAX_VALUE;

        for (int i = 0; i < numberOfDIgits; i++) {
            System.out.println("Enter digit to check");
            int digit = scan.nextInt();

            if (digit < smallest){
                smallest = digit;
            }
        }
        System.out.printf("Smallest digit is: ", smallest);
    }
}
