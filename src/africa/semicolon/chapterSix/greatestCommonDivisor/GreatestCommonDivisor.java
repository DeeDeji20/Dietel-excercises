package africa.semicolon.chapterSix.greatestCommonDivisor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int commonDivisor = gcd(24, 30);
        System.out.println(commonDivisor);
    }

    private static int gcd(int num1, int num2) {
        int gcd =0;
        for (int i = 1; i <= num1 && i<= num2; i++) {
            if (num1 % i ==0 && num2 % i ==0) gcd = i;
        }
        return gcd;
    }
}
