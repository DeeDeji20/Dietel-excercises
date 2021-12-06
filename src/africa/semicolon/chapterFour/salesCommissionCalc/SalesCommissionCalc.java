package africa.semicolon.chapterFour.salesCommissionCalc;

import java.util.Scanner;

public class SalesCommissionCalc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the gross sale for the week");
        int grossSale = scan.nextInt();

        int salary = 200;

        double totalSalary = salary + (0.09 * grossSale);
        System.out.println(totalSalary);
    }
}
