package africa.semicolon.chapterSix.beautifyingStrings;

import java.util.Scanner;

public class BeautifyingStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String newString = scan.nextLine();
        String beautifiedString = beautifystring(newString);
        System.out.println(beautifiedString);
    }

    private static String beautifystring(String input) {
        String result = checkorFullStop(input);
        return checkForCapitalLetter(result);
    }

    private static String checkForCapitalLetter(String input) {
            String firstCharacter = "";
        for (int i = 0; i < 1; i++) {
            if (!Character.isUpperCase(input.charAt(i))){
                firstCharacter+= Character.toUpperCase(input.charAt(i));
                for (int j = 1; j < input.length(); j++) {
                    firstCharacter+= Character.toString(input.charAt(j));
                }
            }else
                firstCharacter = input;

        }
        return firstCharacter;
    }

    private static String checkorFullStop(String input) {
        String newValue ="";
            if (input.charAt(input.length()-1) != '.'){
                newValue= input.concat(".");
            }else{
                newValue = input;
            }
            return newValue;
    }
}
