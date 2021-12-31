package africa.semicolon.handsOn.deeperLookIntoClasses.staticImport;

import static java.lang.Math.*;
//import static java.lang.Math.sqrt;

public class staticImportTest {
    public static void main(String[] args) {
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        System.out.printf("PI = %f%n", PI);
    }
}
