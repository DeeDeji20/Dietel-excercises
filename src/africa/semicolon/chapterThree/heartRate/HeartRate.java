package africa.semicolon.chapterThree.heartRate;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRate(String firstName, String lastName, int month, int day, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }


    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int usersAge(){
        int currentYear = 2021;
        int myAge = currentYear - getYear();
        return myAge;

    }

    public int maximumHeartRate(){
        int maxHeartRate = 220 - usersAge();
        return maxHeartRate;
    }

    public double minTargetHeartRate(){
        double min;
        return min = (50.0/100.0) * maximumHeartRate();
    }

    public double maxTargetHeartRate(){
        double max;
        return max= (85.0/100.0) * maximumHeartRate();
    }
    public void targetHeartRate(){
        System.out.printf("Your target heart rate is between %.2f - %.2f", minTargetHeartRate(), maxTargetHeartRate());
    }
}
