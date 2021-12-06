package africa.semicolon.assignments.patterns;

import java.util.Scanner;

public class PatternB {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits");
        int number = scan.nextInt();
        for (int a = number; a >=1; a --){
            for(int b = 1; b <= a;  b++ ){
                System.out.print(b+ " ");

            }
            System.out.println();
        }
    }
}
