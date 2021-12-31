package africa.semicolon.assignments.christmasQuestions;

import java.util.ArrayList;

public class ChristmasQuestionsMain {
    public static void main(String[] args) {
        ChristmasQuestion questions = new ChristmasQuestion();
        questions.promptUserForName();
        questions.renderQuestions();
        System.out.printf("You got %d out of %d correctly %n", questions.getCountCorrectAnswers(), questions.getQuestionServed());
    }
}
