package africa.semicolon.chapterFour.salaryCalculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grossPay = 0.0;
        int employeeCount =0;
        final int  MIN_HOURS = 40;
        while (employeeCount < 3){
            System.out.println("Enter your pay per hour");
            double payPerHour = scan.nextDouble();

            System.out.println("Enter number of hours worked each week");
            int hoursWorked = scan.nextInt();
            if(hoursWorked > MIN_HOURS){
                grossPay =(payPerHour * hoursWorked) + (1.5 * (hoursWorked-MIN_HOURS) *payPerHour);
            }else{
                grossPay = payPerHour * hoursWorked;
            }
            System.out.println(grossPay);
            employeeCount++;
        }

    }
}












































