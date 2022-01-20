package africa.semicolon.chapterSeven.machineLearningProgram;

import java.util.Scanner;

public class MachineLearning {
    private final int[] firstSetOfNumbers = new int[10];
    private final int[] secondSetOfNumbers = new int[10];
    private final Scanner scan = new Scanner(System.in);
    public void startProgram() {
        collectTenNumbers();
    }

    private void collectTenNumbers() {
        System.out.println("Enter a number-> ");
        int input = scan.nextInt();
        int count =0;
        int sum = 0;
        while (count != firstSetOfNumbers.length && input != -1){
            firstSetOfNumbers[count] = input;
            sum+=input;
            System.out.println("Enter a number-> ");
            input = scan.nextInt();
            count++;
        }
        System.out.println(sum);
    }

}
