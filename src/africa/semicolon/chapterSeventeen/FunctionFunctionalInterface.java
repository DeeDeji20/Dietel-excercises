package africa.semicolon.chapterSeventeen;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionFunctionalInterface {
    public static void main(String[] args) {
        Map<Integer, String> integerToString = new HashMap<Integer, String>();
        integerToString.put(10, "A");
        integerToString.put(11, "B");
        integerToString.put(12, "C");
        integerToString.put(13, "D");
        integerToString.put(14, "E");
        integerToString.put(15, "F");

        IntFunction<String> mapToString = x-> integerToString.getOrDefault(x, String.valueOf(x));
        System.out.println(IntStream.rangeClosed(1, 15).mapToObj(mapToString).collect(Collectors.joining(" ")));
    }
}
