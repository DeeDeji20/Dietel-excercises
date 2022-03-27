package africa.semicolon.chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    @Test
    void testThatClassExists(){
        PigLatin pigLatin = new PigLatin();
        assertNotNull(pigLatin);
    }

    @Test
    void testThatWordCanBeConvertedToPigLatin(){
        PigLatin pigLatin = new PigLatin();
        pigLatin.printLatinWord("jump");
        assertEquals("umpjay", pigLatin.getPigLatin());
    }
}