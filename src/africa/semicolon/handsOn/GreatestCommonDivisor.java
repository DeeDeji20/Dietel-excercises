package africa.semicolon.handsOn;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first digit");
        int firstDigit = scan.nextInt();
        System.out.println("Enter second digit");
        int secondDigit = scan.nextInt();
        int greatestCommonDivisor =0;
        for (int i =2; i< firstDigit; i++){
            for (int j =2; j< secondDigit; j++){
                if(firstDigit % i ==0 && secondDigit %i ==0){
                    greatestCommonDivisor = i;
                }
            }
        }
        System.out.printf("The greatest common divisor is %d", greatestCommonDivisor);
    }
}
