package africa.semicolon.assignments.chibobTV;

import java.util.Scanner;

public class TvDriver {
    public static Scanner scanner = new Scanner(System.in);
    public static Television myTv = new Television("HiSense", 1);

    public static void main(String[] args) {
//        System.out.println(myTv.toString());
        initialPrompt();
    }

    private static void initialPrompt() {
        String prompt = """
                Welcome please enter a option
                1. turn tv on
                0. turn tv off
                """;

                int userInput = display(prompt);
                if (userInput ==1){
                    myTv.toggleIsOn();
                    System.out.println("Tv has been turned on");
                    operationOptions();
                }
                else if (userInput == 0){
                    while (myTv.checkState()){
                        System.out.println("goodbye");
                        myTv.toggleIsOn();
//                        System.exit(0);
                    }

                } else {
                    System.out.println("Invalid option");
                    initialPrompt();
                }
    }

    private static void operationOptions() {
        String prompt = """
                Press
                1. volume
                2. channel
                3. go back
                """;

        int userInput = display(prompt);
        if (userInput == 1) volumeOption();
        else if (userInput == 2) channelOption();
        else if (userInput == 3) initialPrompt();
        else {
            System.out.println("Invalid option");
            operationOptions();
        }
    }

    private static void channelOption() {
        String prompt = """
                Press
                1. increase channel by 1
                2. decrease channel by 1
                3. to navigate to desired channel
                """;

        int userInput = display(prompt);

        if (userInput == 1){
            myTv.arrowUp();
            System.out.println("You are on channel " + myTv.getChannel());
//            System.out.println(myTv.toString());

        }
        else if (userInput == 2){
            myTv.arrowDown();
            System.out.println("You are on channel " + myTv.getChannel());
        }
        else if (userInput == 3) setTvChannel();
        else {
            System.out.println("Invalid option");
        }
            channelOption();
    }

    private static void setTvChannel() {
        System.out.println("Enter tv channel");
        int myChannel = scanner.nextInt();
//        if (myChannel < )
        myTv.setChannel(myChannel);
        System.out.println("You are on channel " + myTv.getChannel());
    }

    private static void volumeOption() {
        do {
            String prompt = """
                Press
                1. increase volume
                2. decrease volume
                3. go back
                """;

            int userInput = display(prompt);
            if (userInput == 1){
                myTv.volumeUp();
                System.out.println("The volume of tv is " + myTv.getVolume());
//            input(prompt);
            }
            else if (userInput == 2){
                myTv.volumeDown();
                System.out.println("The volume of tv is " + myTv.getVolume());
//                display(prompt);
            }else if(userInput == 3){
                operationOptions();
            }else {
                System.out.println("invalid option");
                volumeOption();
            }
        }while (true);

    }

    private static int input() {
        return 0;
    }

    private static int display(String message) {
        System.out.println(message);
        int result =scanner.nextInt();
        return result;
    }


}
