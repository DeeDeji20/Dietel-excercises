package africa.semicolon.chapterSix.findingMinimum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MinimumTest {
    @Test
    void createMinimumTest(){
        Minimum minimum = new Minimum();
        assertNotNull(minimum);
    }

    @Test
    void testThatMethodFindsMinimumNumber(){
        Minimum minimum = new Minimum();
        int minNum = minimum.getMinimum(13, 67, 2);
        assertEquals(2, minNum);
    }
}
