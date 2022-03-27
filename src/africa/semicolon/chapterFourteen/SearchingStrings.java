package africa.semicolon.chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class SearchingStrings {
    public static void main(String[] args) {
//        To be or not to be: that is the question
        searchingStrings("quesqtionn");
    }

    private static void searchingStrings(String text) {
//        int[] counts = new int[25];
        List<Integer> list = new ArrayList();
        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = i+1; j < text.length(); j++) {
                if (text.charAt(j) == text.charAt(i)) {
                    count++;
                }
            }
            list.add(count);
        }
        System.out.println(list);
    }
}
