package africa.semicolon.chapterSix.seperatingDigits;

import africa.semicolon.chapterTwo.SeperatingDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SeperatingDigitsTest {
    @Test
    void createSeperaringDigitsClass(){
        SeperatingDigit seperatingDigits = new SeperatingDigit();
        assertNotNull(seperatingDigits);
    }

    @Test
    void testToGetTheQuotientWhenDivide(){
        SeperatingDigit seperatingDigits = new SeperatingDigit();
        int quotient  = seperatingDigits.calculateQuotient(1523, 1000);
        assertEquals(1, quotient);
    }

    @Test
    void testToGetTheRemainderWhenDivided(){
        SeperatingDigit seperatingDigits = new SeperatingDigit();
        int remainder  = seperatingDigits.calculateRemainder(1523, 1000);
        assertEquals(523, remainder);
    }

    @Test
    void testThatIntegersCanBESeperated(){
        SeperatingDigit seperatingDigit = new SeperatingDigit();
        int digits = 1523;
        seperatingDigit.calculateQuotient(digits, 1000);
        String digit = seperatingDigit.displayDigits(digits);
        assertEquals("1 5 2 3", digit);
    }
}
