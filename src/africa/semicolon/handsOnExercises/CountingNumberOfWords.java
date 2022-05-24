package africa.semicolon.handsOnExercises;

import java.util.HashMap;
import java.util.Map;

public class CountingNumberOfWords {
    public static void main(String[] args) {
        Map<Character, Integer> countingLetters= new HashMap<>();
        String word = "adeola";
        for (char letter : word.toCharArray()){
            if (countingLetters.containsKey(letter)){
                countingLetters.put(letter, countingLetters.get(letter)+1);
            }
            else countingLetters.put(letter, 1);
        }
        System.out.println(countingLetters);
    }


//    public static void count(String word) {
//        Map<Character, Integer> countingLetters= new HashMap<>();
//        for (char letter : word.toCharArray()){
//            if (countingLetters.containsKey(letter)){
//                countingLetters.put(letter, countingLetters.get(letter)+1);
//            }
//            countingLetters.put(letter, 1);
//        }
//    }
}
