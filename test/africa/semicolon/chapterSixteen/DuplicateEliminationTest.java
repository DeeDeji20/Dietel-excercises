package africa.semicolon.chapterSixteen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    @Test
    void testThatNumbersAreReadAndDuplicatesCanBeEliminated()  {
        String[] list = new String[]{"Tife", "Yetty", "Toni", "Dupe", "Toni", "Emma", "Yetty"};
        DuplicateElimination.processInformation(list);
        assertEquals(5, DuplicateElimination.getSize());
    }

    @Test
    void testThatANameCanBeGottenFromSet(){
        String[] list = new String[]{"Tife", "Yetty", "Toni", "Dupe", "Toni", "Emma", "Yetty"};
        DuplicateElimination.processInformation(list);
//        DuplicateElimination.getUser("Toni");
        assertTrue(DuplicateElimination.getUser("Toni"));
    }
}