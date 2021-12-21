package africa.semicolon.assignments.sevenSegmentDisplay;

import java.util.Scanner;

public class SevenSegmentMain {
    public static void main(String[] args) {
        System.out.println("Enter binary digits only");
        Scanner scan= new Scanner(System.in);
        String userInput = scan.nextLine();
        SevenSegmentDisplay segmentDisplay = new SevenSegmentDisplay();
        segmentDisplay.setSevenSegment(userInput);
        segmentDisplay.displaySevenSegment();

    }
}
