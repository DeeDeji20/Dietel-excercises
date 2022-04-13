package africa.semicolon.algo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class WordFormationTest {
    WordFormation wordFormation;
    @BeforeEach
    void setUp(){
        wordFormation = new WordFormation();
    }

    @Test
    void testThatANumberCanBeAddedToStack(){
        String[] ops = {"1", "2", "3"};
        int result =  wordFormation.solution(ops);
        assertEquals(3, wordFormation.getStack().size());
        assertEquals(3, wordFormation.getStack().peek());
    }

    @Test
    void testThatTopElementInStackCanBeDuplicated(){
        String[] ops = {"1", "2", "3", "DUP"};
        wordFormation.solution(ops);
        assertEquals(4, wordFormation.getStack().size());
        assertEquals(3, wordFormation.getStack().peek());
    }

    @Test
    void testThatWhenStackIsEmpty_DUPoperationReturnsMinusOne(){
        String[] ops= {"DUP"};
        assertEquals(0, wordFormation.getStack().size());
        assertEquals(-1, wordFormation.solution(ops));
    }
    @Test
    void testThatTheDifferenceBetweenFirstTwoTopElementsCanBeSubtractedAndPushedBackToTheStack(){
        String[] ops = {"1", "2", "3", "-"};
        wordFormation.solution(ops);
        assertEquals(2, wordFormation.getStack().size());
        assertEquals(1, wordFormation.getStack().peek());
    }

    @Test
    void testThatWhenStackIsEmpty_SubtractionOperationReturnsMinusOne() {
        String[] ops = {"-"};
        assertEquals(-1,wordFormation.solution(ops));
        assertEquals(0,wordFormation.getStack().size());
    }
    @Test
    void testThatStackWithOneElementWithSubtractionOperationReturnsMinusOne() {
        String[] ops = {"3", "-"};
        assertEquals(-1, wordFormation.solution(ops));
        assertEquals(1, wordFormation.getStack().size());
    }

    @Test
    void testThatWhenStackIsEmpty_AdditionOperationReturnsMinusOne(){
        String[] ops = {"+"};
        assertEquals(-1,wordFormation.solution(ops));
        assertEquals(0,wordFormation.getStack().size());
    }

    @Test
    void testThatTheSumOfFirstTwoTopElementsCanBeAddedAndPushedBackToTheStack(){
        String[] ops = {"1", "2", "3", "+"};
        wordFormation.solution(ops);
        assertEquals(2, wordFormation.getStack().size());
        assertEquals(5, wordFormation.getStack().peek());
    }

    @Test
    void testThatStackWithOneElementWithAdditionOperationReturnsMinusOne(){
        String[] ops = {"3", "+"};
        assertEquals(-1, wordFormation.solution(ops));
        assertEquals(1, wordFormation.getStack().size());
    }

    @Test
    void testThatWhenStackIsEmpty_POPOperationReturnsMinusOne() {
        String[] ops = {"POP"};
        assertEquals(-1,wordFormation.solution(ops));
        assertEquals(0,wordFormation.getStack().size());
    }

    @Test
    void testThatTopElementCanBeRemovedFromStack() {
        String[] ops = {"1", "2", "3", "POP"};
        wordFormation.solution(ops);
        assertEquals(2, wordFormation.getStack().size());
        assertEquals(2, wordFormation.getStack().peek());

    }

}