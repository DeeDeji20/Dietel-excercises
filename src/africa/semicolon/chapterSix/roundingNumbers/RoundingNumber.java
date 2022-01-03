package africa.semicolon.chapterSix.roundingNumbers;

public class RoundingNumber {
    public double roundingNumbers(double number) {
        return Math.floor(number);
    }

    public double roundToInteger(double number) {
        return Math.floor(number * 10 + 0.5)/10;
    }

    public double roundToTenth(double number) {
        return Math.floor(number * 100 + 0.5)/100;
    }

    public double roundTohundredth(double number) {
        return Math.floor(number * 1000 + 0.5)/ 1000;
    }

    public double roundToThousandths(double number) {
        return Math.floor(number * 10000 + .5)/ 10000;
    }
}
