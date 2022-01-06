package africa.semicolon.chapterSix;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();

        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
//                System.out.println(i);
                total+=i;
            }
        }
        if (total == number){
            System.out.println("Perfect number");
        }else System.out.println("Not perfect");
    }
}
