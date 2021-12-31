package africa.semicolon.chapterSeven.duplicateElimination;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        int[] numbers = {-1, -1, -1, -1, -1};
        Scanner scan = new Scanner(System.in);
        int input;
//        if (input < 10 || input > 100) throw new IllegalArgumentException("Invalid input");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter numbers between 10 and 100");
                input = scan.nextInt();

                for (int j = i; j >= 0; j--) {
                    if (input != numbers[j]) {
                        numbers[i] = input;
                    }else {
                        numbers[i] = -1;
                        break;
                    }
                }
            }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
