package africa.semicolon.assignments;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCollectionTest {
    @Test
    void arrayCanTakeNumbers(){
        //given that i have an array
        IntegerCollection collection = new IntegerCollection();
        List<Integer> array = collection.getNumbers();
//        collection.setNumbers(5);
        array.add(2);
        assertEquals(1, array.size());
    }
}
