package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class SmallestAndLargestInteger {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first integers: ");
        int firstInteger= scan.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger= scan.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger= scan.nextInt();

        int sum= firstInteger + secondInteger + thirdInteger;
        int average= sum/3;
        int product= firstInteger * secondInteger * thirdInteger;

        int largest=Integer.MIN_VALUE;
        if(firstInteger > secondInteger){
            largest = firstInteger;
        }
        if(secondInteger > largest){
            largest= secondInteger;
        }
        if(thirdInteger > largest){
            largest = thirdInteger;
        }
        int smallest = Integer.MAX_VALUE;
        if (smallest > firstInteger){
            smallest = firstInteger;
        }
        if(firstInteger > secondInteger){
            smallest = secondInteger;
        }
        if(secondInteger > thirdInteger){
            smallest= thirdInteger;
        }

        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The largest number is %d%n", largest);
        System.out.printf("The smallest number is %d%n", smallest);
    }
}
