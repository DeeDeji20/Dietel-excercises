package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class ArithmeticOfInteger {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first integers: ");
        int firstInteger= scan.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger= scan.nextInt();

        int sum= firstInteger + secondInteger;
        int product= firstInteger * secondInteger;
        int difference= firstInteger - secondInteger;
        int quotient= firstInteger / secondInteger;

        System.out.printf("Sum is %d%nProduct is %d%nDifference is %d%nQuotient is %d%n", sum, product, difference, quotient);
    }
}
