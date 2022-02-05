package africa.semicolon.assignments.myersBriggsQuestionnaire;

import java.util.Scanner;

public class PersonalityTestQuestionnaire {
    private static Scanner scan = new Scanner(System.in);

    String[] questions = {
    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",
//    "What is your personality? A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one"
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
            String answer = scan.nextLine();
        }
    }
}
