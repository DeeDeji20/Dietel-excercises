package africa.semicolon.algo;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        int[] list = {12,34,67,13,45};

        Arrays.stream(list).filter((x)-> x >= 13)
                .findFirst().ifPresent(System.out::println);
    }
}
