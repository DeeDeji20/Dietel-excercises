package africa.semicolon.chapterSix.findingMinimum;

import java.util.Scanner;

public class MinimumMain {
    public static void main(String[] args) {
        Minimum minimum = new Minimum();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = scan.nextInt();
        System.out.println("Enter number");
        int num2 = scan.nextInt();
        System.out.println("Enter number");
        int num3 = scan.nextInt();
        int min = minimum.getMinimum(num1, num2, num3);
        System.out.printf("The minimum value is %d", min);
    }
}
