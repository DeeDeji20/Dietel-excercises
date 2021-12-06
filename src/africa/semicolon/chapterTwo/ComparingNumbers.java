package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first integers: ");
        int firstInteger= scan.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger= scan.nextInt();

        if(firstInteger > secondInteger){
            System.out.printf("%d is larger", firstInteger);
        }

        if(firstInteger < secondInteger){
            System.out.printf("%d is larger", secondInteger);
        }
        if(firstInteger == secondInteger) {
            System.out.print("These numbers are equal");
        }
    }
}
