package africa.semicolon.chapterFive;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Number\tFactors\t\t\t\t\tFactorial");
        for (int i = 1; i < 10; i++) {
            int total = 1;
            System.out.print(i + "\t\t");
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d\t", j);
                total *= j;
            }
            System.out.printf("%30d", total);
        System.out.println();
        }

    }
}
