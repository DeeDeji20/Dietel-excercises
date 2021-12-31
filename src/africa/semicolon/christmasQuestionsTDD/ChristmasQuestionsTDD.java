package africa.semicolon.christmasQuestionsTDD;

import java.security.SecureRandom;

public class ChristmasQuestionsTDD {
    private final String[] questions = {
            "When is Christmas celebrated? A. 25 December B.10th Fabruary",
            "Why is Christmas celebrated? A. Birth of Jesus Christ B. Resurrection",
            "The short version of Christmas is also known as what? A. Zmas  B.Xmas",
            "What does the red color of Christmas symbolize? A.Red wine B.Blood of Jesus",
            "What does the green color of Christmas signify? A.Life B.Agriculture",
            "What does mistletoe symbolize? A.Kisses B.Love"
    };

    private String[] randomQuestions = new String[6];

    public String[] getQuestions() {
        return questions;
    }

    private void shuffleQuestions(){
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 6; i++) {
            int randomNumber= random.nextInt(6);
            randomQuestions[i] = questions[randomNumber];
        }
    }

    public String[] getRandomQuestions() {
        shuffleQuestions();
        return randomQuestions;
    }
}
