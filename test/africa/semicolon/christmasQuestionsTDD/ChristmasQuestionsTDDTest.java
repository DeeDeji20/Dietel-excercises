package africa.semicolon.christmasQuestionsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasQuestionsTDDTest {
    private ChristmasQuestionsTDD christmasQuestionsTDD;
    private String[] questions;
    @BeforeEach
    void setUp() {
        christmasQuestionsTDD = new ChristmasQuestionsTDD();
        questions = christmasQuestionsTDD.getQuestions();
    }

    @Test
    void testThatAListOfSixQuestionsExists() {
        String[] returnedQuestions = christmasQuestionsTDD.getQuestions();
        assertEquals(6, returnedQuestions.length);
    }

    @Test
    void testThatQuestionsCanBeGeneratedAtRandom() {
        //when i display a question at random
       assertNotEquals(questions, christmasQuestionsTDD.getRandomQuestions());
        for (int i = 0; i < christmasQuestionsTDD.getRandomQuestions().length; i++) {
            assertNotNull(christmasQuestionsTDD.getRandomQuestions()[i]);
        }
    }
}