package africa.semicolon.handsOn.deeperLookIntoClasses.time1;

import africa.semicolon.handsOn.deeperLookIntoClasses.time1.Time1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        displayTime("After time object has been created", time);
        System.out.println("=".repeat(20));

        try {
            time.setTime(99, 99, 99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception messaage: %s%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);

        System.out.println("=".repeat(20));

        time.setTime(13,12,45);
        displayTime("After calling setTime with correct values", time);
    }

    private static void displayTime(String message, Time1 time) {
        System.out.printf("%s%nUniversal time: %s%n and Standard time is %s%n", message, time.toUniversalString(), time.toString());
    }
}
