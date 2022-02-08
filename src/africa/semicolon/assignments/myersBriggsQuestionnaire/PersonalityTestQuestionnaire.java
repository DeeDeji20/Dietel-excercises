package africa.semicolon.assignments.myersBriggsQuestionnaire;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonalityTestQuestionnaire {
    private final Scanner scan = new Scanner(System.in);
    private final String[] answers = new String[20];
    String[] questions = {
            "(A).expand energy,conserve groups (B).conserve energy,enjoy one-on-one",
            "(A).interpret literally (B).look for meaning and possibilities",
            "(A).logical,thinking,questioning (B).empathetic,feeling,accommodating",
            "(A).organized,orderly (B).flexible,adaptable",
            "(A).more outgoing,think out loud (B).more reserved,think to yourself",
            "(A).practical,realistic,experiential (B).imaginative,innovative,theoretical",
            "(A).candid,straight forward,frank (B).tactful,encouraging,kind",
            "(A).plan,schedule (B).unplanned,spontaneous",
            "(A).seek many tasks,public activities,interaction with others (B).seek private,solitary activities with quiet to concentrate",
            "(A).standard,usual,conventional (B).different,novel,unique",
            "(A).firm,tend to criticize,hold the line  (B).gentle,tend to appreciate,conciliate",
            "(A).regulated,structured (b).easygoing, \"live\" and \"let live\"",
            "(A).external,communicative,express yourself (B).internal,reticent,keep to yourself",
            "(A).focus on here-and-now (B).look to the future,global perspective,\"big picture\"",
            "(A).tough-minded,just (B).tender-hearted,merciful",
            "(A).preparation,plan ahead (B).go with the flow,adapt as you go",
            "(A).active,initiate (B).reflective,deliberate",
            "(A).facts,things,\"what is\" (B).ideas,dreams,\"what could be\",philosophical",
            "(A).matter of fact,issue-oriented (B).sensitive,people oriented,compassionate",
            "(A).control,govern (B).latitude,freedom"
    } ;
    public void promptUserForName(String msg) {
        System.out.println(msg);
        System.out.println("Welcome " + input());
    }

    private String input() {
        return scan.nextLine();
    }

    public void renderQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String answer = input().toUpperCase();
            answer = validateUserInput(questions[i], answer);
            answers[i]= answer;
//            printAnswers();
        }
    }

    private String validateUserInput(String question, String answer) {
        while (!answer.equals("A") && !answer.equals("B")){
            System.out.println("Not a valid option");
            System.out.println(question);
            answer = input().toUpperCase();
        }
        return answer;
    }

    public void checkPersonalityTypeIntrovertAndExtrovert() {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < answers.length; i+=4) {
            if (answers[i].equals("A")) countA++;
            if (answers[i].equals("B")) countB++;
        }
        if (countA > countB) System.out.println("Extrovert");
        else System.out.println("Introvert");
    }

    public void printAnswers() {
        System.out.println(Arrays.deepToString(answers));
    }

    public void checkPersonalityTypeSensitiveAndIntuitive() {
        int countA = 0;
        int countB = 0;
        for (int i = 1; i < answers.length; i+=4) {
            if (answers[i].equals("A")) countA++;
            if (answers[i].equals("B")) countB++;
        }
        if (countA > countB) System.out.println("Sensitive");
        else System.out.println("Intuitive");
    }

    public void checkPersonalityTypeThinkersFeelers() {
        int countA = 0;
        int countB = 0;
        for (int i = 2; i < answers.length; i+=4) {
            if (answers[i].equals("A")) countA++;
            if (answers[i].equals("B")) countB++;
        }
        if (countA > countB) System.out.println("Thinkers");
        else System.out.println("Feelers");
    }

    public void checkPersonalityTypeJudgementPerception() {
        int countA = 0;
        int countB = 0;
        for (int i = 3; i < answers.length; i+=4) {
            if (answers[i].equals("A")) countA++;
            if (answers[i].equals("B")) countB++;
        }
        if (countA > countB) System.out.println("Judgement");
        else System.out.println("Perception");
    }

    public void checkPersonalityType() {
        System.out.println("Your personality type is: ");
        checkPersonalityTypeIntrovertAndExtrovert();
        checkPersonalityTypeSensitiveAndIntuitive();
        checkPersonalityTypeThinkersFeelers();
        checkPersonalityTypeJudgementPerception();
    }
}