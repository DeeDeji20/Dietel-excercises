package africa.semicolon.chapterThree.healthProfile;

public class HealthProfile {
    private  String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;
    private static int currentYear=2021;

    //constructor
    public HealthProfile(String firstName, String lastName, String gender, int day, int month, int year, double height, double weight){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.day=day;
        this.month=month;
        this.year=year;

        if(height>0.00){
            this.height= height;
        }else{
            this.height=0.0;
        }

        if(weight>0.0){
            this.weight=weight;
        }
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public String getGender(){
        return gender;
    }
    public void setDay(int day){
        this.day=day;
    }

    public int getDay(){
        return day;
    }
    public void setMonth(int month){
        this.month=month;
    }

    public int getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year=year;
    }

    public int getYear(){
        return year;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight(){
        return height;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public double getWeight(){
        return weight;
    }

    public int getUserAge(){
        return currentYear-year;
    }
    public double getHeartRate(){
        return (220-getUserAge());
    }

    public void getTargetHeartRate(){
        double minHeartRate= getHeartRate()*0.5;
        double maxHeartRate= getHeartRate()*0.85;

        System.out.printf("Min HeartRate Range= %.2f and Max HeartRate Range= %.2f", minHeartRate, maxHeartRate);
    }

    public String getBodyMassIndex(){
//        double BMI= (getWeight())/(getHeight()*getHeight());
        double BMI= Math.ceil((getWeight())/(getHeight()*getHeight()));
//        System.out.printf("BMI= %.2f", BMI);
        String status = "BMI of " + BMI + " is ";
        if(BMI<= 18.5){
           status+= "Underweight";
        }else if(BMI>=18.5 && BMI<=24.9){
            status+= "Normal";
        }else if(BMI>=25 && BMI<=29.9){
            status+= "Overweight";
        }else if(BMI>=30){
            status+= "Obese";
        }
        return status;
    }
}
