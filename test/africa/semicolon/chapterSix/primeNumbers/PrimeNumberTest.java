package africa.semicolon.chapterSix.primeNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {
    @Test
    void createPrimeNumberTest(){
        PrimeNumber primeNumber = new PrimeNumber();
        assertNotNull(primeNumber);
    }

    @Test
    void testThatnumberIsPrime(){
        PrimeNumber primeNumber = new PrimeNumber();
        boolean isPrime = primeNumber.isPrime(5);
        assertTrue(isPrime);
    }
}
