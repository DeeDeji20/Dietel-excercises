package africa.semicolon.handsOnExercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

    public static int count(String word) {
        Map<Character, Integer> countingLetters = new HashMap<>();
        Set<Character> setOfLetters = new HashSet<>();
        for (char letter : word.toCharArray()) {
            if (countingLetters.containsKey(letter)) {
                countingLetters.put(letter, countingLetters.get(letter) + 1);
            } else countingLetters.put(letter, 1);
        }

        return 0;
    }
}