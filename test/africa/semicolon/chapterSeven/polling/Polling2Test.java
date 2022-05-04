package africa.semicolon.chapterSeven.polling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Polling2Test {
    Polling2 polling;
    @BeforeEach
    void setup(){
        polling = new Polling2();
    }
    @Test
    void testThatClassIsNotNull(){
        assertNotNull(polling);
    }

    @Test
    void testThatFiveTopicsExistInArray(){
        assertEquals(5, polling.getTopics().length);

    }
}