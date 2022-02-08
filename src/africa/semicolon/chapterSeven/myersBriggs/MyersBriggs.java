package africa.semicolon.chapterSeven.myersBriggs;

import java.util.ArrayList;

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
    public void setQuestions(Questions question) {
        questions.add(question);
    }
//
//    public String renderQuestions() {
//    }
}
