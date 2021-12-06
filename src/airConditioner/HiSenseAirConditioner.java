package airConditioner;

import java.util.Scanner;

public class HiSenseAirConditioner {
    public static Scanner scan = new Scanner(System.in);
    public static AirConditioner myAc = new AirConditioner("HiSense");
    public static void main(String[] args) {
        startOption();
    }

    public static void startOption() {
        display("Welcome to HiSense air conditioner!!! To purchase our product choose yes and no to exit\n");
        String choice = scan.nextLine();
        boolean responseIsTrue = choice.toUpperCase().charAt(0) == 'Y';
        boolean responseIsFalse = choice.toUpperCase().charAt(0) == 'N';
        if (responseIsTrue){
            switchAcOnAndOff();
        }else if (responseIsFalse) {
            System.exit(0);
        }else {
            startOption();
        }
    }

    public static void switchAcOnAndOff() {
        String options = """
                press 0 to switch AC off
                Press 1 to switch AC on
                """;
                int userInput = input(options);
                turnAcOnOrOff(userInput);
    }

    public static void turnAcOnOrOff(int choice) {
        if (choice == 0) myAc.turnAcOff();
        else if (choice == 1){
                myAc.turnAcOn();
                display("Your AC is on");
                display("Your default temp is "+showTemperature());
                increaseAndDecreaseTemperatureOptions();
            }
        else  turnAcOnOrOff(choice);

    }

    public static void increaseAndDecreaseTemperatureOptions() {
        String option = """
                 press 1 to increase temperature
                 press 2 to decrease temperature
                 press 3 to go back
                """;
            int userInput = input(option);
            if (userInput == 1){
                myAc.increaseAcTemperature();
                display("Your temp is "+showTemperature());
                increaseAndDecreaseTemperatureOptions();
            }
            else if (userInput == 2) {
                myAc.decreaseAcTemperature();
                display("Your temp is " + showTemperature());
                increaseAndDecreaseTemperatureOptions();
            }
            else if (userInput == 3) switchAcOnAndOff();
            else increaseAndDecreaseTemperatureOptions();
    }

    public static int showTemperature() {
        return myAc.getTemperature();
    }

    public static int input(String message) {
        display(message);
        return scan.nextInt();
    }

    public static void display(String message) {
        System.out.println(message);
    }
}
