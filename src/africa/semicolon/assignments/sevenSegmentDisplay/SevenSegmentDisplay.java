package africa.semicolon.assignments.sevenSegmentDisplay;

import java.util.Arrays;

public class SevenSegmentDisplay {
    private static final int[][] segments= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    public void setSevenSegment(String value)
    {
        validateInput(value);
    }

    private void validateInput(String value) {
       boolean isValid= isValid(value);
       boolean isOn = value.charAt(value.length()-1) == '1';
        if (isValid && isOn){
            switchSegment(value);
        }else{
            for (int[] segment : segments) {
                Arrays.fill(segment, 0);
            }
            displaySevenSegment();
        }
    }

    private void switchSegment(String value) {

        if (Character.getNumericValue(value.charAt(0)) == 1){
            switchOnSegmentA();
        }
        if (Character.getNumericValue(value.charAt(1)) == 1){
            switchOnSegmentB();
        }
        if (Character.getNumericValue(value.charAt(2)) == 1){
            switchOnSegmentC();
        }
        if (Character.getNumericValue(value.charAt(3)) == 1){
            switchOnSegmentD();
        }
        if (Character.getNumericValue(value.charAt(4)) == 1){
            switchOnSegmentE();
        }
        if (Character.getNumericValue(value.charAt(5)) == 1){
            switchOnSegmentF();
        }
        if (Character.getNumericValue(value.charAt(6)) == 1){
            switchOnSegmentG();
        }
    }

    private boolean isValid(String userInput) {
        if (userInput.length() == 8) return true;
        else{
            System.out.println("not valid");
            return false;
        }
    }


    public void displaySevenSegment() {
        for (int i = 0; i < segments.length; i++) {
            for (int j = 0; j < segments[i].length; j++) {
                if (segments[i][j] == 1) System.out.print('#');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void switchOnSegmentA(){
        for (int row = 0; row < 1; row++) {
            for (int column = 0; column < segments[row].length; column++) {
                segments[row][column] = 1;
            }
        }
    }
    public void switchOnSegmentB(){
        for (int row = 3; row < 4; row++) {
            for (int column = 0; column < 3; column++) {
                segments[column][row] = 1;
            }
        }
    }
    public void switchOnSegmentC(){
        for (int row = 3; row < 4; row++) {
            for (int column = 3; column < 5; column++) {
                segments[column][row] = 1;
            }
        }
    }
    public void switchOnSegmentD(){
        for (int row = 4; row < 5; row++) {
            for (int column = 0; column < 4; column++) {
                segments[row][column] = 1;
            }
        }
    }
    public void switchOnSegmentE(){
        for (int row = 0; row < 1; row++) {
            for (int column = 2; column < 4; column++) {
                segments[column][row] = 1;
            }
        }
    }
    public void switchOnSegmentF(){
        for (int row = 0; row < 1; row++) {
            for (int column = 0; column < 3; column++) {
                segments[column][row] = 1;
            }
        }
    }
    public void switchOnSegmentG(){
        for (int row = 0; row < 4; row++) {
            for (int column = 2; column < 3; column++) {
                segments[column][row] = 1;
            }
        }
    }
}
