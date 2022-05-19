package africa.semicolon.handsOnExercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3, 24, 89, 12, 56, 189));
        for (int number:numbers) {
            System.out.println(number);
        }
    }
}
