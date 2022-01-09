package africa.semicolon.chapterSix.reversingDigits;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReversingDigitsMain {
    public static void main(String[] args) {
        ReversingDigits reversingDigits = new ReversingDigits();
        try{
            System.out.println("Enter digit to be reversed");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            reversingDigits.reversedigit(number);
        }catch (InputMismatchException e){
            System.out.println("Not a digit");
        }
    }
}
