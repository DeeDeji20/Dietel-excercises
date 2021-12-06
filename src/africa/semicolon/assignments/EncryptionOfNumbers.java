package africa.semicolon.assignments;

import java.util.Scanner;

public class EncryptionOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four digit pin");
        int number = scan.nextInt();


        int firstNumber = (number/1000 + 7)%10;
        int sceondNumber = (number%1000/100 +7)%10;
        int thirdNumber = (number %100/10 + 7)%10;
        int fourthNumber = (number%10 + 7)%10;


        int firstNumber2 = thirdNumber;
        int sceondNumber2 = fourthNumber;
        int thirdNumber2 = firstNumber;
        int fourthNumber2 = sceondNumber;

        System.out.print(firstNumber2);
        System.out.print(sceondNumber2);
        System.out.print(thirdNumber2);
        System.out.print(fourthNumber2);
    }
}
