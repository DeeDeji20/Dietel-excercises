package africa.semicolon.chapterFour.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 digits");
        String digits = scan.next();

        int i=0;
        int j= digits.length()-1;
        while (digits.length() < 5){
            System.out.println("Enter valid 5 digits");
            digits = scan.next();
        }
        while (i<j){
            if (digits.charAt(i)== digits.charAt(j)){
                System.out.println("It is a palindrome number");
            }else {
                System.out.println("Not palindrome");
            }
            i++;
            j--;
        }
    }
}
