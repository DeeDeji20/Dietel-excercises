package africa.semicolon.chapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class SumOfrRandomNumber {
    private static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
        sunmOfRandomNumber();
    }

    private static void sunmOfRandomNumber() {
        System.out.println(random.ints(100, 1, 26)
                .sum());
;    }
}
