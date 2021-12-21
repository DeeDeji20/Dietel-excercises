package africa.semicolon.assignments;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection {
    private final List<Integer> numberList = new ArrayList<>();
    public List<Integer> getNumbers() {
        return  numberList;
    }

    public void setNumbers(int number) {
        numberList.add(number);
    }
}
