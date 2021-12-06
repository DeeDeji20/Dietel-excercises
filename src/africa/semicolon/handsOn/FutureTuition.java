package africa.semicolon.handsOn;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        while(tuition < 20000){
            double tuitionRaise = 0.07 * tuition;
            tuition= tuition + tuitionRaise;
            year++;
        }
        System.out.printf("It will take %d years to hit %.2f", year, tuition);
    }
}
