package africa.semicolon.chapterSeven.polling;

import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] turtleArray = new int[20][20];
//        int[] commands = {1,2,3,4,5, 6,7,8,9,10}
        System.out.println("Enter your move");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while (input != 9){
            if (input == 1){
                System.out.println("Your pen is up");
                System.out.println("Enter your next move");
                input = scan.nextInt();
            }
            if (input == 2) {
                System.out.println("Pen is down");
                System.out.println("Enter your next move");
                input = scan.nextInt();
            }
            if (input == 3){
                System.out.println("you have turned right");
                System.out.println("Enter next move");
                input = scan.nextInt();
            }
            if (input == 4){
                System.out.println("you have turned left");
                System.out.println("Enter next move to move forward");
                input = scan.nextInt();
                System.out.println("Enter to move how many spaces");
                input = scan.nextInt();
            }
        }
            moves(input, input, turtleArray);
        displayArray(turtleArray);
    }

    private static void moves(int input1, int input2, int[][] turtleArray) {
        if (input1 == 5 ){
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < input2; j++) {
                    turtleArray[i][j] = 1;
                }
            }
        }
    }

    private static void displayArray(int[][] turtleArray) {
        for (int i = 0; i < turtleArray.length; i++) {
            for (int j = 0; j < turtleArray[i].length; j++) {
                System.out.print(turtleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
