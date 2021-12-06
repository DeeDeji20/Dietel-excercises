package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= scan.nextInt();

        if(number%2==0){
            System.out.printf("%d is an even number", number);
        }
        if(number%2==1){
            System.out.printf("%d is an odd number", number);
        }
    }
}
