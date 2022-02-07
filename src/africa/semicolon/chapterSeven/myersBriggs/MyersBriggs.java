package africa.semicolon.chapterSeven.myersBriggs;

import java.awt.*;
import java.util.ArrayList;

public class MyersBriggs {
    ArrayList<Questions> questions = new ArrayList<Questions>();

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public void renderQuestions() {
    }

    public void setQuestions(Questions question) {
        questions.add(question);
    }
}
