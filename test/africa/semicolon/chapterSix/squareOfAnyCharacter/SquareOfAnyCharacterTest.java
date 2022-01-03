package africa.semicolon.chapterSix.squareOfAnyCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareOfAnyCharacterTest {
    @Test
    void testToCreateClass(){
        SquareOfAnyCharacter squareOfAnyCharacter = new SquareOfAnyCharacter();
        squareOfAnyCharacter.squareOfAnyCharacter(5, '#');
        assertEquals(25, squareOfAnyCharacter.getCount());
    }
}
