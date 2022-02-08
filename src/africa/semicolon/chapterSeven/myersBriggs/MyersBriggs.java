package africa.semicolon.chapterSeven.myersBriggs;

import java.util.ArrayList;
import java.util.Arrays;

import static africa.semicolon.chapterSeven.myersBriggs.PersonalityTrait.*;

public class MyersBriggs {
    ArrayList<Questions> questions = new ArrayList<>();


    private static int sequence = 0;

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public Questions renderQuestion() {
      Questions newQuestion = questions.get(sequence);
      sequence++;
      return newQuestion;
    }
    public void addQuestions(Questions... question) {
        questions.addAll(Arrays.asList(question));
    }

    public PersonalityTrait getIntrovertAndExtrovertPersonality(String[] userResponses) {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < userResponses.length; i+=4) {
            if (userResponses[i].equals("A")) countA++;
            if (userResponses[i].equals("B")) countB++;
        }

        if (countB > countA) return INTROVERT;
        else return EXTROVERT;
    }

    public PersonalityTrait getSensitiveAndIntuitivePersonality(String[] userResponses) {
        int countA = 0;
        int countB = 0;
        for (int i = 1; i < userResponses.length; i+=4) {
            if (userResponses[i].equals("A")) countA++;
            if (userResponses[i].equals("B")) countB++;
        }

        if (countB > countA) return INTUITIVE;
        return SENSITIVE;
    }

    public PersonalityTrait getThinkersAndFeelersPersonality(String[] userResponses) {
        int countA = 0;
        int countB = 0;
        for (int i = 2; i < userResponses.length; i+=4) {
            if (userResponses[i].equals("A")) countA++;
            if (userResponses[i].equals("B")) countB++;
        }

        if (countB > countA) return FEELERS;
        else return THINKERS;
    }

    public PersonalityTrait getJudgementAndPerseptionPersonality(String[] userResponses) {
        int countA = 0;
        int countB = 0;
        for (int i = 3; i < userResponses.length; i+=4) {
            if (userResponses[i].equals("A")) countA++;
            if (userResponses[i].equals("B")) countB++;
        }

        if (countB > countA) return PERCEPTION;
        else return JUDGEMENT;
    }
//
//    public String renderQuestions() {
//    }
}
