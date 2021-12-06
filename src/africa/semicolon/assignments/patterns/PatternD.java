package africa.semicolon.assignments.patterns;

import java.util.Scanner;

public class PatternD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits");
        int number = scan.nextInt();

        for (int i = number; i >=1; i--){
            for (int j = 1; j <=i; j++ ){
                System.out.print( j+" ");
            }
            System.out.println();
            for (int k=i; k<=number; k++)
                System.out.print("  ");
        }
    }
}
