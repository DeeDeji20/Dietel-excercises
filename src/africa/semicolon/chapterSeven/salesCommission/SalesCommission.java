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

            int salesPerWeek = collectSalesPerWeekPerEmployee();
            double employeeSalary = calclateEmployeeSalesCommission(salesPerWeek);
            inputEmployeeSalaryIntoArray(employeeSalaries, employeeSalary);
            System.out.println(employeeSalaries);
    }

    private static void inputEmployeeSalaryIntoArray(ArrayList<Double> employeeSalaries, double employeeSalary) {
        employeeSalaries.add(employeeSalary);
    }

    private static double calclateEmployeeSalesCommission(int salesPerWeek) {
        int salary = 200;
        double commission = 0.09;
        double employeeSalary = salary + (commission * salesPerWeek);
        return employeeSalary;
    }

    private static int collectSalesPerWeekPerEmployee() {
        System.out.println("Enter the sales: ");
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
