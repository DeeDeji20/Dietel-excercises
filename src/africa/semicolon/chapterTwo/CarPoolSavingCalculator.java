package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class CarPoolSavingCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total miles driven per day");
        double milesDriven= scan.nextDouble();

        System.out.println("Enter cost per gallon of gasoline");
        double costOfGasoline= scan.nextDouble();

        System.out.println("Enter average miles per gallon");
        double averageMilesPerGallon= scan.nextDouble();

        System.out.println("Enter parking fee per day");
        double parkingFeePerDay= scan.nextDouble();

        System.out.println("Enter tolls per day");
        double tollsPerDay= scan.nextDouble();

        double dailyDrivingCost = ((milesDriven / averageMilesPerGallon) * costOfGasoline) + parkingFeePerDay + tollsPerDay;

        System.out.printf("Daily driving cost is %.2f%n", dailyDrivingCost);
    }
}
