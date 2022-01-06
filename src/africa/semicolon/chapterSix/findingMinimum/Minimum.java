package africa.semicolon.chapterSix.findingMinimum;

public class Minimum {
    public int getMinimum(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}
