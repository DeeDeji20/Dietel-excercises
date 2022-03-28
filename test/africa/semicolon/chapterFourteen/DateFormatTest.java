package africa.semicolon.chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatTest {
    @Test
    void convertDateToString(){
        DateFormat.convertDate("04/25/1995");
        assertEquals("April 25, 1995", DateFormat.getDate());
    }

    @Test
    void convertDateToNewFormat(){
        DateFormat.convertDateFormat("April 25, 1995");
        assertEquals("04/25/1995", DateFormat.getDateFormat());
    }
}