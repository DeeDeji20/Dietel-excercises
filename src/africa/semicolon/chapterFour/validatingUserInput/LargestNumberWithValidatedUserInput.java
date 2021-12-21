package africa.semicolon.chapterFour.validatingUserInput;

import java.util.Scanner;

/*
        * Ask for number other than 1 and 2 form a user
        * check if each of the numbers is greater than Integer_MIN
        * if it then it is the largest number
 * */
public class LargestNumberWithValidatedUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scan.nextInt();
//        int value ;
        int largestNumber =Integer.MIN_VALUE;
        while (userInput != 1 || userInput != 2){
//            int count=0;
                if(userInput > largestNumber){
                    largestNumber = userInput;
                }
                System.out.println("Enter a number");
                userInput = scan.nextInt();
        }

    }

}
