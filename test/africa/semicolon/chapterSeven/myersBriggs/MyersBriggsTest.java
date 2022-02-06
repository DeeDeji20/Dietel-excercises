package africa.semicolon.chapterSeven.myersBriggs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyersBriggsTest {
    MyersBriggs briggs;
    @BeforeEach
    public void setUp(){
        briggs = new MyersBriggs();
    }

    @Test
    public void testThatMyersBriggsIsCreated() {
        assertNotNull(briggs);
    }
    @Test
    public void testThatQuestionsExists(){
        String[] questions = briggs.getQuestions();
        assertEquals(6, questions.length);
    }

    @Test
    public void testThatQuestionsCanBeServedOneAfterTheOther(){
        briggs.renderQuestions();
    }

}