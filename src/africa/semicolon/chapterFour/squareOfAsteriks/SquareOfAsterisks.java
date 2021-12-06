package africa.semicolon.chapterFour.squareOfAsteriks;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of sides");

        int numberOfSides = scan.nextInt();

        for (int i =1; i <=numberOfSides; i++){
            for (int j =1; j <=numberOfSides; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
