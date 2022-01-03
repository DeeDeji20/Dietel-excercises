package africa.semicolon.chapterSix.multiples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplesTest {
    @Test
    void testThatIHaveAMultipleClass(){
        Multiples multiples = new Multiples();
        assertNotNull(multiples);
    }

    @Test
    void testMultiplesOfEvenNumbers(){
        Multiples multiples = new Multiples();
        boolean isMultiple =multiples.isMultiple(8, 2);
        assertTrue(isMultiple);
    }

    @Test
    void testMultiplesOfOddNumbers(){
        Multiples multiples = new Multiples();
        boolean isMultiple =multiples.isMultiple(9, 3);
        assertTrue(isMultiple);
    }

    @Test
    void testIfNotMultipleReturnsFalse(){
        Multiples multiples = new Multiples();
        boolean isMultiple =multiples.isMultiple(7, 2);
        assertFalse(isMultiple);
    }
}
