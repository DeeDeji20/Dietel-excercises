package africa.semicolon.mathClass;

public class MathClass {
    private int root;
    private int max;
    private double doubleMax;
    private double ceilValue;
    private double floorValue;
    public void sqrt(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) root = i;
        }
    }

    public int getSquareRoot() {
        return root;
    }

    public void max(int num1, int num2) {
        if (num1 > num2) max = num1;
        else max = num2;

    }

    public int getMaximum() {
        return max;
    }

    public void max(double num1, double num2) {
        if (num1 > num2) doubleMax = num1;
        else doubleMax = num2;
    }

    public double getDoubleMaximum() {
        return doubleMax;
    }

    public void ceilImplementation(double number) {
        ceilValue= (int)number + 1;
    }

    public double getCeilValue() {
        return ceilValue;
    }

    public void floorImplementation(double number) {
        floorValue= (int)number;
    }

    public double getFloorImplementation() {
        return floorValue;
    }
}
