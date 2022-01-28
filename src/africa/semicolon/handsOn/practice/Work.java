package africa.semicolon.handsOn.practice;

public class Work {
    public static void main(String[] args) {
        double val = 12.56789456;

        String digit =String.format("%.2f", val);
        System.out.println(digit);
    }
}
