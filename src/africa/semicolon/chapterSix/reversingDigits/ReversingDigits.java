package africa.semicolon.chapterSix.reversingDigits;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Double.NaN;

public class ReversingDigits {
    public void reversedigit(int number) {
        if (number ==NaN) throw new InputMismatchException();
        String convertedToSting = number + "";
//        System.out.println(convertedToSting.length());
        StringBuilder reversedDigit = new StringBuilder();
        for (int i = convertedToSting.length()-1; i >= 0; i--) {
            reversedDigit.append(convertedToSting.charAt(i));
        }
        System.out.println(reversedDigit);
    }
}

