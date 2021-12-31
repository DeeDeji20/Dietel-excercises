package africa.semicolon.chapterSix.parkingCharges;

import java.util.Scanner;

public class ParkingCharges {
    private static final double MIN_CHARGE = 2.00;
    private static final double MAX_CHARGE = 10.00;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter customer's ID");
        int customerID= scan.nextInt();
        while(customerID != -1) {
            System.out.println("Enter number of hours parked");
            int numberOfHoursParked = scan.nextInt();
            double charge = parkingCharges(numberOfHoursParked);
            displayCharges(customerID, numberOfHoursParked, charge);
            System.out.println("Enter customer's ID");
            customerID = scan.nextInt();
        }
    }

    private static void displayCharges(int customeriD, int hours, double charge) {
        System.out.printf("Cusomer %d charge for %d hours is %.2f%n", customeriD, hours, charge);
    }

    private static double parkingCharges(int numberOfHoursParked) {
        int minimumNumberOfHoursToPark = 3;
        int maximumNumberOfHoursToPark = 24;
        double totalCharge = 0.0;
        if (numberOfHoursParked >= minimumNumberOfHoursToPark){
            for (int i = 1; i <= numberOfHoursParked; i++) {
                totalCharge = MIN_CHARGE + (.5 * i);
            }
        }
        if(numberOfHoursParked >= maximumNumberOfHoursToPark){
            totalCharge = MAX_CHARGE;
        }
        if(numberOfHoursParked <= minimumNumberOfHoursToPark){
            totalCharge = MIN_CHARGE;
        }
        return  totalCharge;
    }
}
