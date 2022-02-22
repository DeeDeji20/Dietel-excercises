package africa.semicolon;

import java.util.Arrays;
import java.util.Scanner;
//
public class Binary {
    public static void main(String[] args) {
        System.out.println("Enter binary dits");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(Character.getNumericValue(userInput.charAt(i)*2) +" ");
//            System.out.print(userInput.charAt(i) *2 + " ");
        }
        System.out.println();

    }
}
