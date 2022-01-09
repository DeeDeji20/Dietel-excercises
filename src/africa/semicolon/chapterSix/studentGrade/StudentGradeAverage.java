package africa.semicolon.chapterSix.studentGrade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeAverage {
    public static void main(String[] args) {
        try {
            System.out.println("Enter score");
            Scanner scan = new Scanner(System.in);
            int score = scan.nextInt()                                          ;
            int point = qualityPoints(score);
            System.out.println(point);
        }catch (InputMismatchException e){
            System.out.println("Invalid grade");
        }

    }

    private static int qualityPoints(int average) {
        int grade = 0;
        switch (average/10){
            case 10, 9 -> grade = 4;
            case 8-> grade = 3;
            case 7-> grade = 2;
            case 6-> grade = 1;
            case 5-> grade = 0;
            default -> {throw new InputMismatchException();}
        }
        return grade;
    }
}
