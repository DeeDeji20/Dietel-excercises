package africa.semicolon.assignments.myersBriggsQuestionnaire;

import java.util.InputMismatchException;

public class PersonalityTestQuestionnaireTest {
    public static void main(String[] args) {
        PersonalityTestQuestionnaire questions = new PersonalityTestQuestionnaire();
        try {

            questions.promptUserForName("What is your name? ");
            questions.renderQuestions();
            questions.checkPersonalityType();
            questions.printAnswers();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());        }catch (NullPointerException e){
            System.out.println("Why are you null?");
        }

    }
}
