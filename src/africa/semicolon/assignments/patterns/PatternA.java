package africa.semicolon.assignments.patterns;

import java.util.Scanner;

public class PatternA {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits");
        int number = scan.nextInt();
        for (int a = 1; a <=number; a ++){
            for(int b = 1; b <= a; b ++){
                System.out.print(b+ " ");

            }
            System.out.println();
        }
    }
}
