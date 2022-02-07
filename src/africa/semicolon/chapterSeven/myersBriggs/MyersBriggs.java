package africa.semicolon.chapterSeven.myersBriggs;

import java.util.ArrayList;

public class MyersBriggs {
    ArrayList<Questions> questions = new ArrayList<>();

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

//    public Questions renderQuestions() {
//        for (Questions question : questions) {
//            return question.getOptions();
//        }
//        return null;
//    }
    
    

    public void setQuestions(Questions question) {
        questions.add(question);
    }

    public String renderQuestions() {
    }
}
