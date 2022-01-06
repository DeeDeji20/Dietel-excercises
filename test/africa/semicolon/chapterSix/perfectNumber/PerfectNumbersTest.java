package africa.semicolon.chapterSix.perfectNumber;

import africa.semicolon.chapterSix.PerfectNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersTest {
    @Test
    void createPerfectNumberClass(){
        PerfectNumbers perfectNumber = new PerfectNumbers();
        assertNotNull(perfectNumber);
    }

//    @Test
//    void tetsAllTheFactorsOfNumber(){
//        PerfectNumbers perfectNumbers = new PerfectNumbers();
//        int number = perfectNumbers.getFactors(6);
//        assertEquals(3, perfectNumbers.getFactors(6));
//    }

    @Test
    void testForPerfectNumbers(){
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        boolean isPerfect = perfectNumbers.isPerfect(28);
        int factor = perfectNumbers.getFactors(28);
        assertTrue(isPerfect);
    }
}
