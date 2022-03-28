package africa.semicolon.chapterFourteen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class DateFormat {
    private static final StringBuilder builder = new StringBuilder();

    public static void convertDate(String date) {
        String[] newDate = date.split("/");
        newDate[0] =newDate[0].substring(1);
        getMonth(newDate);
        builder.append(" ").append(newDate[1]).append(", ").append(newDate[2]);
    }

    private static void getMonth(String[] newDate) {
        System.out.println(newDate[0]);

        switch (newDate[0]) {
            case "1" -> builder.append("January");
            case "2" -> builder.append("February");
            case "3" -> builder.append("March");
            case "4" -> builder.append("April");
            case "5" -> builder.append("May");
            case "6" -> builder.append("June");
            case "7" -> builder.append("July");
            case "8" -> builder.append("August");
            case "9" -> builder.append("September");
            case "10" -> builder.append("October");
            case "11" -> builder.append("November");
            case "12" -> builder.append("December");
        }
    }

    public static String getDate() {
        return builder.toString();
    }

    public static void convertDateFormat(String date) {
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == ',') {
                String firstPart = date.substring(0, i);
                String secondString = date.substring(i + 1);
                String val = firstPart.concat(secondString);
            }
        }

    }
}
