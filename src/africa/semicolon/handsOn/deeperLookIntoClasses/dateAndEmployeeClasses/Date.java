package africa.semicolon.handsOn.deeperLookIntoClasses.dateAndEmployeeClasses;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 31};

    public Date(int month, int day, int year){
        //checks
        if (month <= 0 || month > 12) throw new IllegalArgumentException("month(" + month + ") must be 1-12");
        if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) throw new IllegalArgumentException("day(" + day + ") out of range for specified month and year");
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) throw new IllegalArgumentException("day(" + day + ") out-of-range for the specified month and year");

        this.month = month;
        this.day= day;
        this.year =year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
