package africa.semicolon.handsOn;

public class VarArgsDemo {
    public static void main(String[] args) {
       double result= printMax(new double[]{1,2,3, 24, 56});
       result = printMax(1,2,23,45);
        System.out.println(result);
    }

    private static double printMax(double... numbers) {
        double total=0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }
}
