package africa.semicolon.chapterSix.evenOrOdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenOrOddTest {
    @Test
    void createEvenOrOddClass(){
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertNotNull(evenOrOdd);
    }

    @Test
    void testThatNumberIsEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        boolean isEven = evenOrOdd.isEven(12);
        assertTrue(isEven);
    }

    @Test
    void testThatNumberIsNotEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        boolean isEven = evenOrOdd.isEven(11);
        assertFalse(isEven);
    }
}
