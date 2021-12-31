package africa.semicolon.assignments.christmasQuestions;

import java.util.Objects;
import java.util.Scanner;

public class ChristmasQuestion {
   private final String[] questions = {
            "When is Christmas celebrated? A. 25 December B.10th Fabruary",
            "Why is Christmas celebrated? A. Birth of Jesus Christ B. Resurrection",
            "The short version of Christmas is also known as what? A. Zmas  B.Xmas",
            "What does the red color of Christmas symbolize? A.Red wine B.Blood of Jesus",
            "What does the green color of Christmas signify? A.Life B.Agriculture",
            "What does mistletoe symbolize? A.Kisses B.Love"
    };
    private final String[] answers = new String[5];
    private final String[] correctAnswers = {"A", "A", "B", "B", "A", "B"};
    private final String[] questionsRendered = new String[5];
    private  int countCorrectAnswers =0;
    private int questionServed =0;
    private int falseCount =0;



    public void promptUserForName() {
        System.out.println("What is your name?");
        System.out.println("Welcome " + input());
    }

    private String input() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public void renderQuestions() {
        displayFiveRandomQuestions(questions);
    }


    private void displayFiveRandomQuestions(String[] questions){
        String answerToQuestion;
        while (questionServed < answers.length) {
            int random = gearateRandomNumber();
            if(checkRandomQuestion(questions[random])){
                output(questions[random]);
                questionsRendered[questionServed] = questions[random];
                answerToQuestion = input().toUpperCase();
                answers[questionServed] = answerToQuestion;
                checkUserAnswer(answers[questionServed], correctAnswers[random]);
                questionServed++;
            }else{
                displayFiveRandomQuestions(questions);
            }
        }
    }

    private boolean checkRandomQuestion(String question){
        for (String renderedQuestion :questionsRendered) {
            if (Objects.isNull(questionsRendered[0])) {
                return true;
            }
            else if (question.equals(renderedQuestion)){
                falseCount++;
                return false;
            }
        }
        return true;
    }

    private void checkUserAnswer(String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)){
            countCorrectAnswers++;
        }
    }

    private void output(String question) {
        System.out.println(question);
    }

    private int gearateRandomNumber() {
        return (int) (Math.random() * 5) +1;
    }

    public int getCountCorrectAnswers() {
        return countCorrectAnswers;
    }


    public  int getQuestionServed() {
        return questionServed;
    }

}
