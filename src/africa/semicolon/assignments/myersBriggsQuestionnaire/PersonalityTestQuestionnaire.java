package africa.semicolon.assignments.myersBriggsQuestionnaire;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTestQuestionnaire {
    private static Scanner scan = new Scanner(System.in);

    String[] questions = {
    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",
    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",
    } ;
    private String[][] answers = new String[4][5];


    public void promptUserForName(String msg) {
        System.out.println(msg);
        System.out.println("Welcome " + input());
        System.out.println(Arrays.deepToString(answers));
    }

    private String input() {
        return scan.nextLine();
    }

    public void renderQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String answer = scan.nextLine();
            for (int j = i; j < i+1; j++) {
                for (int k = 0; k <= j; k++){
                    if (answers[j][k] == null){
                        answers[j][k] = answer;
                        break;
                    }
                }
            }
            printAnswers();
        }
//        collectAnswers();
    }

    private void printAnswers() {
        System.out.println(Arrays.deepToString(answers));
    }
}
