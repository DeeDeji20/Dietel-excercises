package africa.semicolon.chapterSix.roundingNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoundingNumberTest {
    @Test
    void testForTheRoundingNumberClass(){
        RoundingNumber roundingNumber = new RoundingNumber();
        assertNotNull(roundingNumber);
    }

    @Test
    void testThatAGivenNumberCanBeRoundedToItsNearestInteger(){
        RoundingNumber roundingNumber = new RoundingNumber();
        double rounded = roundingNumber.roundingNumbers(2.75);
        assertEquals(2.0, rounded);
    }

    @Test
    void testThatNumbercanBeRoundedToInteger(){
        RoundingNumber roundingNumber = new RoundingNumber();
        double roundedNumber =roundingNumber.roundToInteger(200.5908897);
        assertEquals(200.6, roundedNumber);
    }

    @Test
    void testThatNumbercanBeRoundedToTenths(){
        RoundingNumber roundingNumber = new RoundingNumber();
        double roundedNumber = roundingNumber.roundToTenth(200.5908897);
        assertEquals(200.59, roundedNumber);
    }

    @Test
    void testThatNumbercanBeRoundedToHundredths(){
        RoundingNumber roundingNumber = new RoundingNumber();
        double roundedNumber = roundingNumber.roundTohundredth(200.59188978);
        assertEquals(200.592, roundedNumber);
    }

    @Test
    void testThatNumbercanBeRoundedToThousandths(){
        RoundingNumber roundingNumber = new RoundingNumber();
        double roundedNumber = roundingNumber.roundToThousandths(200.59188978);
        assertEquals(200.5919, roundedNumber);
    }
}
