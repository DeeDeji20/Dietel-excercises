package africa.semicolon.chapterSix.circleArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CircleAreaTest {
    @Test
    void createCircleClass(){
        CircleArea circleArea = new CircleArea();
        assertNotNull(circleArea);
    }

    @Test
    void testToCalculateAreaOfCircle(){
        CircleArea circleArea = new CircleArea();
        double area = circleArea.circleArea(2);
        assertEquals(12.568, area);
    }
}
