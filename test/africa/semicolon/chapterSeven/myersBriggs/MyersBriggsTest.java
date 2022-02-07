package africa.semicolon.chapterSeven.myersBriggs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyersBriggsTest {
    MyersBriggs briggs;
//    Questions questions;
    @BeforeEach
    public void setUp(){
        briggs = new MyersBriggs();
    }

    @Test
    public void testThatMyersBriggsIsCreated() {
        assertNotNull(briggs);
    }
    @Test
    public void testThatQuestionnaireHasQuestions(){
        ArrayList<Questions> questions= briggs.getQuestions();
        assertEquals(0, questions.size());
    }

    @Test
    public void testThatQuestionsCanBeadded(){
        Questions questions = new Questions("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        briggs.setQuestions(questions);
        assertEquals(1, briggs.getQuestions().size());
    }

    @Test
    public void testThatAnswersCanBeGotten(){
        Questions questions = new Questions("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        briggs.setQuestions(questions);
    }

    @Test
    public void testThatQuestionsCanBeServedOneAfterTheOther(){
        briggs.renderQuestions();
    }

}