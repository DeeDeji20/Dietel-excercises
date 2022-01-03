package africa.semicolon.chapterFive;

public class DaysOfChristmas {
    public static void main(String[] args) {
        int dayOfChristmas =12;
        for (int i = 1; i <= dayOfChristmas; i++) {
            System.out.print("On the " );
            switch(i){
                case 1 -> System.out.print("first ");
                case 2 -> System.out.print("second ");
                case 3 -> System.out.print("third ");
                case 4 -> System.out.print("fourth ");
                case 5 -> System.out.print("fifth ");
                case 6 -> System.out.print("sixth ");
                case 7 -> System.out.print("seventh ");
                case 8 -> System.out.print("eighth ");
                case 9 -> System.out.print("nineth ");
                case 10 -> System.out.print("tenth ");
                case 11 -> System.out.print("eleventh ");
                case 12 -> System.out.print("twelveth ");
            }
            System.out.println("day of christmas my true love gave to me: ");
            int j = i;
            while (j > 0){
                switch (j){
                    case 1 -> System.out.println("A patridge in a pear tree");
                    case 2 -> System.out.println("Two turtle doves");
                    case 3 -> System.out.println("Three french hen");
                    case 4 -> System.out.println("Four calling birds");
                    case 5 -> System.out.println("Five golden rings");
                    case 6 -> System.out.println("Six geese are laying");
                    case 7 -> System.out.println("Seven swams are swimming");
                    case 8 -> System.out.println("Eight maids are milking");
                    case 9 -> System.out.println("Nine ladies dancing");
                    case 10 -> System.out.println("Ten lords are leaping");
                    case 11 -> System.out.println("Eleven pipers piping");
                    case 12 -> System.out.println("Twelve drummers drumming");
                    default -> System.out.println("Not a day of christmas");
                }
                j--;
                //if (j == 0) break;
            }
            System.out.print("=".repeat(20));
            System.out.println();
        }
    }
}
