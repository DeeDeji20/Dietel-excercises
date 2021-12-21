package africa.semicolon.handsOn.garadeBook;

public class GradeBook {
    private String courseName;
    private int[] grades;

    public  GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void processGrades(){
        outputGrades();
        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("The lowest grade is %d%nHighest grade %d%n", getMinimum(), getMaximum());
        outputBarChart();
    }

    private void outputBarChart() {
        System.out.println("Grade distribution");
        int[] frequency = new int[11];
        for (int grade :
                grades) {
            frequency[grade/10]++;
        }
    }

    private int getMaximum() {
        int minGrade = grades[0];
        for (int grade : grades) {
            if (grade < minGrade) minGrade = grade;
        }
        return minGrade;
    }

    private int getMinimum() {
        int maxGrade = grades[0];
        for (int grade : grades) {
            if (grade > maxGrade) maxGrade = grade;
        }
        return maxGrade;
    }

    private double getAverage() {
        double total=0;
        for (int grade : grades) {
            total+=grade;
        }
        return (double) total/grades.length;
    }

    private void outputGrades() {
        System.out.print("Grades are %n%n");
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2f: %3d%n", student+1, grades[student]);
        }
    }
}
