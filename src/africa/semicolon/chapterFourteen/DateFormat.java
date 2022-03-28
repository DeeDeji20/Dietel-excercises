package africa.semicolon.chapterFourteen;

public class DateFormat {
    private static final StringBuilder builder = new StringBuilder();
    private static final StringBuilder builder2 = new StringBuilder();

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
        String[] strArray = new String[0];
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == ',') {
                String value = extractDate(date, i);
                strArray = value.split(" ");
            }
        }
        getMonthNumber(strArray);
        builder2.append("/").append(strArray[1]).append("/").append(strArray[2]);
    }

    private static void getMonthNumber(String[] strArray) {
        switch(strArray[0].toLowerCase()){
            case "january"-> builder2.append("01");
            case "february"-> builder2.append("02");
            case "march"-> builder2.append("03");
            case "april"-> builder2.append("04");
            case "may"-> builder2.append("05");
            case "june"-> builder2.append("06");
            case "july"-> builder2.append("07");
            case "august"-> builder2.append("08");
            case "september"-> builder2.append("09");
            case "october"-> builder2.append("10");
            case "november"-> builder2.append("11");
            case "december"-> builder2.append("12");
        }
    }

    private static String extractDate(String date, int i) {
        String firstPart = date.substring(0, i);
        String secondString = date.substring(i + 1);
        return firstPart.concat(secondString);
    }

    public static String getDateFormat() {
        return builder2.toString();
    }
}
