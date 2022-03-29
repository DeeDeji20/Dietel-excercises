package africa.semicolon.chapterSixteen;

import java.util.*;


public class CountingDuplicateWords {
    public static void main(String[] args) {
        System.out.println(countOfDuplicate("The boy is a boy is a boy"));
    }

    private static int countOfDuplicate(String sentence) {
        sentence = sentence.toLowerCase();
        String[] sentenceSplit = sentence.split(" ");
        Map<String, Integer> wordCount  = new HashMap<>();

        for (String word: sentenceSplit) {
            if (wordCount.containsKey(word)){
                int count  = wordCount.get(word);
                wordCount.put(word, count+1);

            }else{
                wordCount.put(word, 1);
            }
        }

        int count2=0;
        for (String word: wordCount.keySet()) {
            if (wordCount.get(word) > 1) count2++;
        }
        return count2;
    }
}
