package africa.semicolon.assignments.myersBriggsQuestionnaire;

public class PersonalityTestQuestionnaireTest {
    public static void main(String[] args) {
        PersonalityTestQuestionnaire questions = new PersonalityTestQuestionnaire();
        questions.promptUserForName("What is your name? ");
        questions.renderQuestions();
        questions.checkPersonalityTypeIntrovertAndExtrovert();
        questions.checkPersonalityTypeSensitiveAndIntuitive();
        questions.checkPersonalityTypeThinkersFeelers();
        questions.checkPersonalityTypeJudgementPerception();
    }
}
