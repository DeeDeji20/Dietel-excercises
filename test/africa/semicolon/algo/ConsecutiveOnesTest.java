package africa.semicolon.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveOnesTest {
    ConsecutiveOnes testNumbers;
    @BeforeEach
    void setUp() {
        testNumbers = new ConsecutiveOnes();
    }
    @Test
    void testThatNumbersAppearConsecutively(){
        int[] numbers = {1, 1, 1, 1, 2, 3};
        assertTrue(testNumbers.solution(numbers));
    }

    @Test
    void testThatNumbersThatDontAppearConsecutivelyReturnFalse(){
        int[] numbers = {0, 1, 0, 1, 2, 3};
        assertFalse(testNumbers.solution(numbers));
    }

}