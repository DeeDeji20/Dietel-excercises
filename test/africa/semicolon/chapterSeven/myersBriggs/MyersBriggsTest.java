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
    public void testThatQuestionsCanBeadded(){
        Options option = new Options("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        Questions questions = new Questions(option);
        briggs.setQuestions(questions);
        assertEquals(1, briggs.getQuestions().size());
    }

    @Test
    public void testThatAnswersCanBeGotten(){
        Options option = new Options("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        Questions questions = new Questions(option);
    }

    @Test
    public void testThatQuestionnaireHasQuestions(){
        ArrayList<Questions> questions= briggs.getQuestions();
        assertEquals(0, questions.size());
    }

    @Test
    public void testThatQuestionsCanBeServedOneAfterTheOther(){
        Options option = new Options("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        Questions questions = new Questions(option);
        briggs.setQuestions(questions);
        Options option2 = new Options("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        Questions questions2 = new Questions(option2);
        briggs.setQuestions(questions2);

        assertEquals(2, briggs.getQuestions().size());
        Questions question = briggs.renderQuestions();
        String expected ="(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one";
        assertEquals(expected, question);
    }

}