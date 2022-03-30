package africa.semicolon.chapterSixteen;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingLetters {
    public static void main(String[] args) {
        countingLetters("HELLO THERE");
    }

    private static void countingLetters(String input) {
        input = input.toLowerCase();
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] tokens = input.split("");
        System.out.println(Arrays.toString(tokens));
        for (String _char : tokens) {
            if (_char.equals(" ")) continue;
            if (!map.containsKey(_char)){
                map.put(_char, 1);
            }else{
                map.put(_char, map.get(_char)+1);
            }

        }
        System.out.println(map);
    }
}
