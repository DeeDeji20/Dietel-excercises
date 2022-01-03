package africa.semicolon.chapterSix.squareOfAsterikss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareOfAsteriksTest {
    @Test
    void createAstricksClass(){
        SquareOfAsteriks squareOfAsteriks = new SquareOfAsteriks();
        squareOfAsteriks.squareOfAsteriks(5);
        int count = squareOfAsteriks.getCount();
        assertEquals(25, count);
    }
}
