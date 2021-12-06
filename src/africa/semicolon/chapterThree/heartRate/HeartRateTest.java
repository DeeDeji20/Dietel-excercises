package africa.semicolon.chapterThree.heartRate;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HeartRate myHeartRate = new HeartRate("Adeola", "Oladeji", 9, 15, 2000);

        System.out.println("Enter first Name");
        String myFirstName = scan.nextLine();

        System.out.println("Enter last Name");
        String myLastName = scan.nextLine();

        System.out.println("Enter month of birth");
        int monthOfBirth = scan.nextInt();

        System.out.println("Enter day of birth");
        int dayOfBirth = scan.nextInt();

        System.out.println("Enter year of birth");
        int yearOfBirth = scan.nextInt();

        HeartRate deolasDetails = new HeartRate(myFirstName, myLastName, monthOfBirth, dayOfBirth, yearOfBirth);

        System.out.println(deolasDetails.usersAge());
        System.out.println(deolasDetails.maximumHeartRate());
        deolasDetails.targetHeartRate();
    }
}
