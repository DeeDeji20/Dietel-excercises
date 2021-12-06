package africa.semicolon.chapterFour.largestNumber;

import java.util.Scanner;

/*
* Ask for numer 10 times form a user
* check if each of the numbers is greater than Integer_MIN
* if it then it is the largest number
* */
public class LargestValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value ;
        int count=0;
        int largestNumber =Integer.MIN_VALUE;
        while (count < 10){
            System.out.println("Enter numbers");
            value = scan.nextInt();
            if(value > largestNumber){
                largestNumber = value;
            }
            count++;
        }
        System.out.println(largestNumber);
    }
}
