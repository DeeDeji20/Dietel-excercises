package africa.semicolon.bike;

import java.util.Scanner;

public class BikeDriver {
    public static Scanner scan = new Scanner(System.in);
    public static Bike jinchengBike = new Bike();
    public static void main(String[] args) {
        startBikeOption();
    }

    public static void startBikeOption() {
        String startUpOption = """
                Welcome to jincheng bike
                press 0 to turn off bike
                press 1 to turn on bike
                """;
        int userInput = input(startUpOption);
        if (userInput==0){
            jinchengBike.turnOff();
            System.exit(0);
        }
        else if (userInput==1){
            bikeIsOnOptions();
            changeGearOptions();
        }
        else {
            display("Invalid input");
            startBikeOption();
        }
    }

    private static void changeGearOptions() {
        String gearOptions = """
                press 0 to turn bike off
                press 1 to increase the speed
                press 2 to decrease speed
                """;
        int input = input(gearOptions);
        if (input == 0){
            jinchengBike.turnOff();
            System.exit(0);
        }
        else if (input == 1) {
            jinchengBike.accelerate();
            display(jinchengBike.toString());
            changeGearOptions();
        }
        else if (input == 2){
            jinchengBike.decelerate();
            display(jinchengBike.toString());
            changeGearOptions();
        }
        else {
            display("Invalid input");
            changeGearOptions();
        }
    }

    private static void bikeIsOnOptions() {
        jinchengBike.turnOn();
        System.out.println(jinchengBike.toString());
    }

    private static int input(String message) {
        display(message);
        return scan.nextInt();
    }

    public static void display(String message) {
        System.out.println(message);
    }
}
