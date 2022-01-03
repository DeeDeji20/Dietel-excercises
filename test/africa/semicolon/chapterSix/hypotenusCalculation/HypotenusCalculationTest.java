package africa.semicolon.chapterSix.hypotenusCalculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HypotenusCalculationTest {
    @Test
    void testThatIcanCreateCalculatorClass(){
        HypotenusCalculation hypotenusCalculation = new HypotenusCalculation();
        assertNotNull(hypotenusCalculation);
    }
    @Test
    void testThatICanCalculateForTheHypotenusOfTriangle(){
        HypotenusCalculation hypotenusCalculation = new HypotenusCalculation();
        double hypotenuse = hypotenusCalculation.hypotenuse(3.0, 4.0);
        assertEquals(5, hypotenuse);
    }
}
