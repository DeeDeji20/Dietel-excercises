package africa.semicolon.chapterSeven.myersBriggs;

import java.util.ArrayList;
import java.util.Arrays;

public class MyersBriggs {
    ArrayList<Questions> questions = new ArrayList<>();
//    String[] userResponses = new String[]{"B", "B", "A", "A", "B", "A", "A", "B", "A", "B", "A", "B", "B", "A", "B", "B", "A", "A", "B", "B"};


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

        if (countB > countA) return PersonalityTrait.INTROVERT;
        else return PersonalityTrait.EXTROVERT;
    }
//
//    public String renderQuestions() {
//    }
}
