package africa.semicolon.chapterThree.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double salary){

        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String userFirstName){
        firstName = userFirstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String userLastName){
        lastName = userLastName;
    }

    public double getSalary(){
        return monthlySalary;
    }
    public void setSalary(double userSalary){
        if(userSalary < 0.00)
            monthlySalary = 0.00;
        else
            monthlySalary = userSalary;
    }

    public double employeeYearlySalary(){
        double yearlySalary;
        return yearlySalary = monthlySalary * 12;
    }

    public double employeeSalaryAfterTenPercentRaise(){
        double newSalary;

        newSalary = ((10.0/100.0 * monthlySalary) + monthlySalary) * 12;
        //System.out.println(newSalary);
        return newSalary;
    }
}
