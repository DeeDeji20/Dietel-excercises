package africa.semicolon.chapterSix.perfectNumber;

public class PerfectNumberMain {
    public static void main(String[] args) {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        for (int i = 1; i < 100; i++) {
            System.out.println(i +" is "+ perfectNumbers.isPerfect(i));
        }
    }
}
