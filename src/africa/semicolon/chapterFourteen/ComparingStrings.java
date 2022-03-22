package africa.semicolon.chapterFourteen;

public class ComparingStrings {
    public static void main(String[] args) {
        comparingStrings("input", "output");
    }

    private static void comparingStrings(String firstString, String secondString) {
        int value = firstString.compareTo(secondString);
        if (value > 0) System.out.println(firstString + " is greater than "+ secondString);
        if (value < 0) System.out.println(firstString + " is less than " + secondString);
        if (value == 0) System.out.println(firstString + " is equal to " + secondString);
    }
}
