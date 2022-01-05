package africa.semicolon.chapterFive;

import java.util.Scanner;

public class BarChartPrintingProgram {
    // read five numbers from a user between 1 and 30
    // for each number read, display the corresponding astericks
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput =0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number btw 1 and 30");
            userInput = scanner.nextInt();
            while (userInput > 30){
                System.out.println("Enter a number btw 1 and 30");
                userInput = scanner.nextInt();
            }
            System.out.print(userInput + "-> ");
            for (int j = 0; j < userInput; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
