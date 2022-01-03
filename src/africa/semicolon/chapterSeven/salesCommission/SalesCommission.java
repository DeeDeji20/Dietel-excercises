package africa.semicolon.chapterSeven.salesCommission;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesCommission {
    /**
     * sales person receive 200 + 0.09 of gross sales for that week i.e 200 + 0.09 * 5000
     *1. collect sales person sales for the week
     *2. sum them all up
     *3. calculate the wage of sales person
     *4. push the sales person wage int an array
     * repeat 1 -4 unti; the user reaches an end of line character
     */

    public static void main(String[] args) {
        ArrayList<Double> employeeSalaries = new ArrayList<>();
            int count =0;
            while (count < 2) {
                int salesPerWeek = collectSalesPerWeekPerEmployee();
                double employeeSalary = calclateEmployeeSalesCommission(salesPerWeek);
                inputEmployeeSalaryIntoArray(employeeSalaries, employeeSalary);
                count++;
            }
        System.out.println(employeeSalaries);

            int[] ranges =checkSalaryRange(employeeSalaries);
            printRanges(ranges);

    }

    private static void printRanges(int[] ranges) {
        for (int count = 1; count <= ranges.length; count++) {
            if (count == ranges.length) System.out.printf("%5d: ", 1000);
            else System.out.printf("%2d-%2d: ", 100+(count*100), 100+(count*100+99));

            for (int i = count-1; i < count; i++) {
                if (ranges[count-1] == 0) System.out.print("-");
                else System.out.print(ranges[count-1]);
            }
            System.out.println();
        }
    }

    private static int[] checkSalaryRange(ArrayList<Double> employeeSalaries) {
        int[] ranges = new int[9];
        for (double employeeSalary : employeeSalaries) {

            if (employeeSalary >= 200 && employeeSalary <= 299) ranges[0]++;
            if (employeeSalary >= 300 && employeeSalary <= 399) ranges[1]++;
            if (employeeSalary >= 400 && employeeSalary <= 499) ranges[2]++;
            if (employeeSalary >= 500 && employeeSalary <= 599) ranges[3]++;
            if (employeeSalary >= 600 && employeeSalary <= 699) ranges[4]++;
            if (employeeSalary >= 700 && employeeSalary <= 799) ranges[5]++;
            if (employeeSalary >= 800 && employeeSalary <= 899) ranges[6]++;
            if (employeeSalary >= 900 && employeeSalary <= 999) ranges[7]++;
            if (employeeSalary >= 1000) ranges[8]++;
        }
        return ranges;
    }

    private static void inputEmployeeSalaryIntoArray(ArrayList<Double> employeeSalaries, double employeeSalary) {
        employeeSalaries.add(employeeSalary);
    }

    private static double calclateEmployeeSalesCommission(int salesPerWeek) {
        int salary = 200;
        double commission = 0.09;
        return salary + (commission * salesPerWeek);
    }

    private static int collectSalesPerWeekPerEmployee() {
        System.out.println("Enter the sales and -1 to end program: ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int total =0;
        while (amount > 0){
            total+= amount;
            System.out.println("Enter the sales: ");
            amount = scan.nextInt();
        }
        return total;
    }
}
