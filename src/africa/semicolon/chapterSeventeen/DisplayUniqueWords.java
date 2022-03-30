package africa.semicolon.chapterSeventeen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DisplayUniqueWords {
    public static void main(String[] args) {
        displayUniqueWords("I boy is just a boy");
    }

    private static void displayUniqueWords(String sentence) {
        sentence = sentence.toLowerCase();
        Arrays.stream(sentence.split(" ")).distinct().sorted().forEach(System.out::println);
    }
}
