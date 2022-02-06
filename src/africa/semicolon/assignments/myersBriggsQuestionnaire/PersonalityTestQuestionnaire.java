package africa.semicolon.assignments.myersBriggsQuestionnaire;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTestQuestionnaire {
    private Scanner scan = new Scanner(System.in);
    private String[] answers = new String[20];
//    private String[][] answers = new String[4][5];
    private String choiceA = "A";
    private String choiceB = "B";

    String[] questions = {
    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",
    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",
    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",    "A.expend energy, enjoy groups B.conserve energy, enjoy one-on-one",
    "A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating","A.interpret literally B. look for meaning and possibilities",
    "A.logical, thinking, questioning B. empathetic, feeling, accomodating",
    } ;


    public void promptUserForName(String msg) {
        System.out.println(msg);
        System.out.println("Welcome " + input());
//        System.out.println(Arrays.deepToString(answers));
    }

    private String input() {
        return scan.nextLine();
    }

    public void renderQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String answer = scan.nextLine().toUpperCase();
            answers[i]= answer;
//            verifyAnswer(answer, i);
            printAnswers();
        }
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


    private void verifyAnswer(String answer, int i) {

//        int j = i;
//        if (j >= 4) i = 0;
//        for (j = i; j < i+1; j++) {
//            for (int k = 0; k < k+1; ){
//                System.out.println(j);
//                System.out.println(k);
//                if (answers[j][k] == null){
//                    answers[j][k] = answer;
//                    break;
//                }else {
//                    k += 1;
//                }
//            }
//        }
    }

    private void printAnswers() {
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
}

//    int j = i;
//            if (i % 4 == 0) i = 0;
//                    for (j = i; j < i+1; j++) {
//        for (int k = 0; k < k+1; ){
//        if (answers[j][k] == null){
//        answers[j][k] = answer;
//        break;
//        }else {
//        k += 1;
//        }
//        }
//        }