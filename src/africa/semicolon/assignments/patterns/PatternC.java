package africa.semicolon.assignments.patterns;

import java.util.Scanner;

public class PatternC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int k = number; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
