package africa.semicolon.chapterFour.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();
        int factorial =1;
        for (int i =number; i>=1; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
