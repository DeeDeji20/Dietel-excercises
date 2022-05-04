package africa.semicolon.chapterSeven.duplicateElimination;

import java.util.Scanner;
//
public class DuplicatElimination2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            System.out.println("Enter numbers between 10 and 100");
            int input = scan.nextInt();
            for (int j = i; j >= 0; j--) {
                if (numbers[j] != input){
                    numbers[j] = input;
                    System.out.println(input);
                }
                else System.out.println("Ssame");
            }
            i++;
        }
    }
}
