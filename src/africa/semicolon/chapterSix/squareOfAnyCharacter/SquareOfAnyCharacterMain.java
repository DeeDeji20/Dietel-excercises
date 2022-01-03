package africa.semicolon.chapterSix.squareOfAnyCharacter;

import java.util.Scanner;

public class SquareOfAnyCharacterMain {
    public static void main(String[] args) {
        SquareOfAnyCharacter squareOfAnyCharacter = new SquareOfAnyCharacter();
        System.out.println("Enter the characetr");
        Scanner scan = new Scanner(System.in);
        char fill = scan.next().charAt(0);
        squareOfAnyCharacter.squareOfAnyCharacter(5, fill);
    }
}
