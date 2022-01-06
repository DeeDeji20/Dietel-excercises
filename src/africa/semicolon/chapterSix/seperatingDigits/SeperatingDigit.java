package africa.semicolon.chapterSix.seperatingDigits;

public class SeperatingDigit {
    public int calculateQuotient(int integer, int divisor) {
        return integer/divisor;
    }

    public int calculateRemainder(int integer, int divisor) {
        return integer % divisor;
    }

    public String displayDigits(int digit) {
        String digits = "";
        String number = "" + digit;
        digits+=""+ calculateQuotient(digit, 1000);
        digits+=" "+ calculateRemainder(digit, 1000)/100;
        digits+=" "+ calculateRemainder(digit, 100)/10;
        digits+=" "+ calculateRemainder(digit, 10);
        return digits;
    }
}
