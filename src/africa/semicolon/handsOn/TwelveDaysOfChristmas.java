package africa.semicolon.handsOn;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the day of christmas: ");
        int dayOfChristmas = scan.nextInt();
        String qualify;

        if(dayOfChristmas == 1)qualify= "st";
        else if(dayOfChristmas == 2)qualify= "nd";
        else if(dayOfChristmas == 3)qualify= "rd";
        else qualify ="th";

        System.out.println("On the " + dayOfChristmas + qualify + " day of christmas my true love gave to me");
        while (dayOfChristmas > 0){
            switch (dayOfChristmas){
                case 1 -> System.out.println("A patridge in a pear tree");
                case 2 -> System.out.println("Two turtle doves");
                case 3 -> System.out.println("Three french hen");
                case 4 -> System.out.println("Four calling birds");
                case 5 -> System.out.println("Five golden rings");
                case 6 -> System.out.println("Six geese are laying");
                case 7 -> System.out.println("Seven swams are swimming");
                case 8 -> System.out.println("Eight maids are milking");
                case 9 -> System.out.println("Nine ladies dancing");
                case 10 -> System.out.println("Ten lords re leaping");
                case 11 -> System.out.println("Eleven pipers piping");
                case 12 -> System.out.println("Twelve drummers drumming");
                default -> System.out.println("Not a day of christmas");
            }
            dayOfChristmas--;
        }

    }
}
