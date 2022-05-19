package africa.semicolon.handsOnExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingStringTest {

    @Test
    void testThatStringCanBeReversed(){
        String reversedString = ReversingString.reverse("cohort_nine");
        assertEquals("enin_trohoc", reversedString);
    }



}