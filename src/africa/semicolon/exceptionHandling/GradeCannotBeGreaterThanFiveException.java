package africa.semicolon.exceptionHandling;

public class GradeCannotBeGreaterThanFiveException extends Exception{
    public GradeCannotBeGreaterThanFiveException(String message){
        super(message);
    }
}
