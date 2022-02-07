package africa.semicolon.chapterSeven.myersBriggs;

import java.util.ArrayList;

public class MyersBriggs {
    ArrayList<Questions> questions = new ArrayList<Questions>();

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public Questions renderQuestions() {
        for (int i = 0; i < questions.size(); i++) {
            return questions.get(i);
        }
        return null;
    }

    public void setQuestions(Questions question) {
        questions.add(question);
    }
}
