package africa.semicolon.exceptionHandling;

public class GradeUsage {
    public static void main(String[] args) {

    }
    public String returnGrade(int score) throws InvalidGradeException {
        switch(score/10){
            case 9, 10 -> {
                return "A";
            }
            case 7, 8 -> {
                return "B";
            }
            case 5, 6 -> {
                return "C";
            }

            case 4 -> {
                return  "D";
            }

            case 3, 2, 1 -> {
                return "F";
            }
            default -> throw new InvalidGradeException("You inputted an invlaid score");
        }
    }
}
