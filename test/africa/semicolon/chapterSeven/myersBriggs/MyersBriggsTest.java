package africa.semicolon.chapterSeven.myersBriggs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyersBriggsTest {
    Questionnaire briggs;
//    Questions questions;
    @BeforeEach
    public void setUp(){
        briggs = new Questionnaire();
    }

    @Test
    public void testThatMyersBriggsIsCreated() {
        assertNotNull(briggs);
    }
    @Test
    public void testThatQuestionsCanBeAdded(){
        Questions questions = new Questions("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        briggs.addQuestions(questions);
        assertEquals(1, briggs.getQuestions().size());
    }

    @Test
    public void testThatAnswersCanBeGotten(){
        ArrayList<Responses> responses = new ArrayList<>();
        Responses response = new Responses();
        briggs.setUserResponses(response);
        assertEquals(1, briggs.getResponses().size());
    }

    @Test
    public void testThatQuestionnaireHasQuestions(){
        ArrayList<Questions> questions= briggs.getQuestions();
        assertEquals(0, questions.size());
    }

    @Test
    public void testThatFirstQuestionsCanBeServed(){
        Questions questions = new Questions("(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one");
        Questions questions2 = new Questions("(A).interpret literally (B).look for meaning and possibilities");
        briggs.addQuestions(questions, questions2);

        assertEquals(2, briggs.getQuestions().size());
        Questions question = null;
        for (int i = 0; i <1; i++){
            question = briggs.renderQuestion();
        }
        String expected ="(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one";
        assertEquals(expected, question.getMessage());
    }

    @Test
    public void testThatUserIsAnIntrovert(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"B", "B", "A", "A", "B", "A", "A", "B", "A", "B", "A", "B", "B", "A", "B", "B", "A", "A", "B", "B"};
        PersonalityTrait trait = PersonalityTrait.INTROVERT;
        PersonalityTrait actual = briggs.getIntrovertAndExtrovertPersonality(userResponses);
        assertEquals(trait, actual);
    }

    @Test
    public void testThatUserIsAnExtrovert(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"A", "B", "A", "A", "A", "A", "A", "B", "A", "B", "A", "B", "A", "A", "B", "B", "A", "A", "B", "B"};
        PersonalityTrait trait = PersonalityTrait.EXTROVERT;
        PersonalityTrait actual = briggs.getIntrovertAndExtrovertPersonality(userResponses);
        assertEquals(trait, actual);
    }

    @Test
    public void testThatUserIsSensitive(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"A", "B", "A", "A", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "B", "B", "A", "B", "B", "B"};
        PersonalityTrait trait = PersonalityTrait.INTUITIVE;
        PersonalityTrait actual = briggs.getSensitiveAndIntuitivePersonality(userResponses);
        assertEquals(trait, actual);
    }

    @Test
    public void testThatUserIsIntuitive(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"A", "A", "A", "A", "A", "A", "A", "B", "A", "A", "A", "B", "A", "A", "B", "B", "A", "A", "B", "B"};
        PersonalityTrait trait = PersonalityTrait.SENSITIVE;
        PersonalityTrait actual = briggs.getSensitiveAndIntuitivePersonality(userResponses);
        assertEquals(trait, actual);
    }

    @Test
    public void testThatUserIsThinker(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"A", "B", "A", "A", "A", "A", "A", "B", "A", "B", "A", "B", "A", "A", "A", "B", "A", "A", "A", "B"};
        PersonalityTrait trait = PersonalityTrait.THINKERS;
        PersonalityTrait actual = briggs.getThinkersAndFeelersPersonality(userResponses);
        assertEquals(trait, actual);
    }

    @Test
    public void testThatUserIsAFeeler(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"A", "B", "B", "A", "A", "A", "B", "A", "A", "B", "B", "A", "A", "A", "B", "A", "A", "A", "B", "A"};
        PersonalityTrait trait = PersonalityTrait.FEELERS;
        PersonalityTrait actual = briggs.getThinkersAndFeelersPersonality(userResponses);
        assertEquals(trait, actual);
    }
    @Test
    public void testThatUserIsPerception(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"A", "B", "B", "B", "A", "A", "B", "B", "A", "B", "B", "B", "A", "A", "B", "B", "A", "A", "B", "B"};
        PersonalityTrait trait = PersonalityTrait.PERCEPTION;
        PersonalityTrait actual = briggs.getJudgementAndPerseptionPersonality(userResponses);
        assertEquals(trait, actual);
    }

    @Test
    public void testThatUserIsJudgment(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"A", "B", "A", "A", "A", "A", "A", "A", "A", "B", "A", "A", "A", "A", "B", "A", "A", "A", "B", "A"};
        PersonalityTrait trait = PersonalityTrait.JUDGEMENT;
        PersonalityTrait actual = briggs.getJudgementAndPerseptionPersonality(userResponses);
        assertEquals(trait, actual);
    }

    @Test
    public void testThatPersonalityTraitCanBeComputed(){
        Responses responses = new Responses();
        String[] userResponses =responses.getResponses();
        userResponses = new String[]{"B", "A", "B", "A", "B", "A", "B", "A", "B", "B", "B", "B", "B", "B", "B", "B", "B", "A", "B", "B"};
        String trait = briggs.generatePersonalityTrait(userResponses);
        assertEquals("ISFP", trait);
    }

}