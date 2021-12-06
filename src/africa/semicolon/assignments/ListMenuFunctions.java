package africa.semicolon.assignments;

import java.util.Scanner;

public class ListMenuFunctions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        String menuOption = """
                Enter an option to navigate through the menu
                1.Phone book
                2.Messages
                3.Chat
                4.Call register
                5. Tones
                6. Settings
                7. call Divert
                8. Games
                9. Calculator
                10. Remainder
                11. Clock
                12. Profiles
                13. SIM services
                """;
        System.out.println(menuOption);
        userChoice = scan.nextInt();

        switch (userChoice) {
            case 1 -> {System.out.println("You selected phonebook");
                menuOption = """
                Enter an option to navigate through the menu,
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                """;
                System.out.println(menuOption);
                userChoice = scan.nextInt();
                switch(userChoice){
                    case 1 -> System.out.println("You selected search");
                    case 2 -> System.out.println("You selected service nos");
                    case 3 -> System.out.println("You selected add name");
                    case 4 -> System.out.println("You selected erase");
                    case 5 -> System.out.println("You selected edit");
                    case 6 -> System.out.println("You selected assign tone");
                    case 7 -> System.out.println("You selected send b'card");
                    case 8 -> {System.out.println("You selected options");
                        menuOption = """
                            Enter an option to navigate through the menu,
                            1. Type of view
                            2. Memory status
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch (userChoice){
                            case 1 -> System.out.println("You selected type of view");
                            case 2 -> System.out.println("You selected memory status");
                            default -> System.out.println(userChoice + " is an invalid choice");
                        }
                    }
                    case 9 -> System.out.println("You selected speed dial");
                    case 10 -> System.out.println("You selected voice tags");
                    default -> System.out.println(userChoice + " is an invalid choice");
                }
            }
            case 2 -> {System.out.println("You selected messsage");
                menuOption = """
                Enter an option to navigate through the menu,
                1. Write message
                2. Inbox
                3. Outbox
                4. P
                ictur message
                5. Template
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                """;
                System.out.println(menuOption);
                userChoice = scan.nextInt();
                switch(userChoice) {
                    case 1 -> System.out.println("You selected write message");
                    case 2 -> System.out.println("You selected service Inbox");
                    case 3 -> System.out.println("You selected service outbox");
                    case 4 -> System.out.println("You selected service picture messages");
                    case 5 -> System.out.println("You selected service template");
                    case 6 -> System.out.println("You selected service smiley");
                    case 7 -> {System.out.println("You selected service message settings");
                        menuOption = """
                        Enter an option to navigate through the menu,
                        1. Set 1
                        2. Common
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch(userChoice) {
                            case 1 -> {System.out.println("You selected set1");
                                menuOption = """
                                Enter an option to navigate through the menu,
                                1. message center number
                                2. message sent as
                                2. message validity
                                """;
                                System.out.println(menuOption);
                                userChoice = scan.nextInt();
                                switch(userChoice) {
                                    case 1 -> System.out.println("You selected center number");
                                    case 2 -> System.out.println("You selected sent as");
                                    case 3 -> System.out.println("You selected message validity");
                                    default -> System.out.println(userChoice + " is an invalid choice");
                                }
                            }
                            case 2 -> {System.out.println("You selected common");
                                menuOption = """
                                Enter an option to navigate through the menu,
                                1. Delivery reports
                                2. Reply via same center
                                2. Character support
                                """;
                                System.out.println(menuOption);
                                userChoice = scan.nextInt();
                                switch(userChoice) {
                                    case 1 -> System.out.println("You selected Delivery reports");
                                    case 2 -> System.out.println("You selected Reply via same center");
                                    case 3 -> System.out.println("You selected Character support");
                                    default -> System.out.println(userChoice + " is an invalid choice");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("You selected service info seriviec");
                    case 9 -> System.out.println("You selected service voice mailbox number");
                    case 10 -> System.out.println("You selected service service command editor");
                    default -> System.out.println(userChoice + " is an invalid choice");
                }
            }
            case 3 -> System.out.println("You selected Chat, please send your chat to loved ones");
            case 4 -> {System.out.println("You selected call register");
                menuOption = """
                Enter an option to navigate through the menu,
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent calls
                5. Show call duration
                6. Show call cost
                7. Call cost settings
                8. Prepaid setting
                """;
                System.out.println(menuOption);
                userChoice = scan.nextInt();

                switch(userChoice) {
                    case 1 -> System.out.println("You selected missed calls");
                    case 2 -> System.out.println("You selected recceived calls");
                    case 3 -> System.out.println("You selected dialled numbers");
                    case 4 -> System.out.println("You selected erase recent call lists");
                    case 5 -> {System.out.println("You selected show call duration");
                        menuOption = """
                        Enter an option to navigate through the menu,
                        1. Last call duration
                        2. All call duration
                        3. Received calls duration
                        4. Dialled calls duration
                        5. Clear timers
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch(userChoice) {
                            case 1 -> System.out.println("You selected last calls' duration");
                            case 2 -> System.out.println("You selected all calls' duration");
                            case 3 -> System.out.println("You selected received calls' duration");
                            case 4 -> System.out.println("You selected dialled calls' duration");
                            case 5 -> System.out.println("You selected Clear timers");
                            default -> System.out.println(userChoice + " is an invalid choice");
                        }
                    }
                    case 6 -> {System.out.println("You selected show call costs");
                        menuOption = """
                        Enter an option to navigate through the menu,
                        1. Last call cost
                        2. All calls' cost
                        3. Clear counters
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch(userChoice) {
                            case 1 -> System.out.println("You selected last call cost");
                            case 2 -> System.out.println("You selected allcall cost");
                            case 3 -> System.out.println("You selected select timer");
                            default -> System.out.println(userChoice + " is an invalid choice");
                        }
                    }
                    case 7 -> {System.out.println("You selected call cost settings");
                        menuOption = """
                        Enter an option to navigate through the menu,
                        1. Call cost limit
                        2. Show costs in
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch(userChoice) {
                            case 1 -> System.out.println("You selected call cost limit");
                            case 3 -> System.out.println("You selected select timer");
                            default -> System.out.println(userChoice + " is an invalid choice");
                        }
                    }
                    case 8 -> System.out.println("You selected prepaid credit");
                }
            }
            case 5 -> {System.out.println("You selected tones");
                menuOption = """
                Enter an option to navigate through the menu,
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                """;
                System.out.println(menuOption);
                userChoice = scan.nextInt();

                switch(userChoice){
                    case 1 -> System.out.println("You selected ring tone");
                    case 2 -> System.out.println("You selected ringing volume");
                    case 3 -> System.out.println("You selected incoming call alert");
                    case 4 -> System.out.println("You selected composer");
                    case 5 -> System.out.println("You selected message alert tones");
                    case 6 -> System.out.println("You selected keypad tone");
                    case 7-> System.out.println("You selected warning and game tone");
                    case 8 -> System.out.println("You selected vibrating alert");
                    case 9 -> System.out.println("You selected screen saver");
                    default -> System.out.println(userChoice + " is an invalid choice");
                }
            }
            case 6 -> {System.out.println("You selected settings");
                menuOption = """
                Enter an option to navigate through the menu,
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                """;
                System.out.println(menuOption);
                userChoice = scan.nextInt();
                switch (userChoice){
                    case 1 -> {System.out.println("You selected call settings");
                        menuOption = """
                        Enter an option to navigate through the menu,
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch(userChoice){
                            case 1 -> System.out.println("You selected automaic redial");
                            case 2 -> System.out.println("You selected speed dialling");
                            case 3 -> System.out.println("You selected call warning option");
                            case 4 -> System.out.println("You selected own number sending");
                            case 5 -> System.out.println("You selected phone line in use");
                            case 6 -> System.out.println("You selected automatic answer");
                            default -> System.out.println(userChoice + " is an invalid choice");
                        }
                    }
                    case 2 -> {System.out.println("You selected phone settings");
                        menuOption = """
                        Enter an option to navigate through the menu,
                        1. Language
                        2. Call info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch(userChoice){
                            case 1 -> System.out.println("You selected language");
                            case 2 -> System.out.println("You selected scell info display");
                            case 3 -> System.out.println("You selected welcome note");
                            case 4 -> System.out.println("You selected network selction");
                            case 5 -> System.out.println("You selected phone lights");
                            case 6 -> System.out.println("You selected Confirm SIM service actions");
                            default -> System.out.println(userChoice + " is an invalid choice");
                        }
                    }
                    case 3 -> {System.out.println("You selected security setting");
                        menuOption = """
                        Enter an option to navigate through the menu,
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change access codes
                        """;
                        System.out.println(menuOption);
                        userChoice = scan.nextInt();
                        switch(userChoice){
                            case 1 -> System.out.println("You selected PIN code request");
                            case 2 -> System.out.println("You selected Call barring service");
                            case 3 -> System.out.println("You selected Fixed dialling");
                            case 4 -> System.out.println("You selected Closed user group");
                            case 5 -> System.out.println("You selected Phone security");
                            case 6 -> System.out.println("You selected Change access codes");
                            default -> System.out.println(userChoice + " is an invalid choice");
                        }
                    }
                    case 4 -> System.out.println("You selected restore factory setting");
                }
            }
            case 7 -> System.out.println("You selected call divert");
            case 8 -> System.out.println("You selected Games");
            case 9 -> System.out.println("You selected Calculator");
            case 10 -> System.out.println("You selected Reminders");
            case 11 -> {System.out.println("You selected Clock");
                menuOption = """
                        Enter an option to navigate through the menu,
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stop watch
                        5. Countdown timer
                        6. Auto update of date and time
                        """;
                System.out.println(menuOption);
                userChoice = scan.nextInt();
                switch(userChoice){
                    case 1 -> System.out.println("You selected Alarm clock");
                    case 3 -> System.out.println("You selected Date setting");
                    case 4 -> System.out.println("You selected Stop watch");
                    case 5 -> System.out.println("You selected Countdown timer");
                    case 6 -> System.out.println("You selected Auto update of date and time");
                    default -> System.out.println(userChoice + " is an invalid choice");
                }

            }
            case 12 -> System.out.println("You selected Profiles");
            case 13 -> System.out.println("You selected SIM services");
            default -> System.out.println(userChoice + " is an invalid choice");
        }
    }
}
