package africa.semicolon.assignments;

public class NumberOfFactors {
    public static void main(String[] args) {
        factorsOfNumber(15);

    }

    private static void factorsOfNumber(int number) {
        int count =0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) count++;
        }
        System.out.println(count);
    }
}
