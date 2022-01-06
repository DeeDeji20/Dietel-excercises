package africa.semicolon.chapterSix.perfectNumber;

public class PerfectNumbers {
    public boolean isPerfect(int number) {
        int sumOfFactors = getFactors(number);
        if (sumOfFactors == number) return true;
        return false;
    }

    public int getFactors(int number) {
        int total =0;
        for (int i = 1; i < number; i++) {
            if (number % i ==0)total += i;
        }
        return total;
    }
}
