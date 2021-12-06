package africa.semicolon.chapterFour.twoLargestNumbers;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value ;
        int count=0;
        int largestNumber =Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        while (count < 10){
            System.out.println("Enter numbers");
            value = scan.nextInt();
            if(value > largestNumber){
                secondLargest = largestNumber;
                largestNumber = value;
            }
            else if(value > secondLargest){
                secondLargest = value;
            }
            ++count;
        }
        System.out.println(largestNumber);
        System.out.println(secondLargest);
    }
}
