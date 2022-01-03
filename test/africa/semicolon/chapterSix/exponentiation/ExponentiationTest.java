package africa.semicolon.chapterSix.exponentiation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentiationTest {
    @Test
    void testThatIHaveExponentiationClass(){
        Exponentiation exponentiation = new Exponentiation();
        double value = exponentiation.integerPower(2, 3);
        assertEquals(8, value);
    }
}
