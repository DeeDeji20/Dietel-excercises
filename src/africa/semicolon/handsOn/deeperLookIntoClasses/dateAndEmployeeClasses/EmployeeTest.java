package africa.semicolon.handsOn.deeperLookIntoClasses.dateAndEmployeeClasses;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate = new Date(7, 24, 1984);
        Date hireDate = new Date(3, 12, 1988);
        Employee employee1 = new Employee("Bob", "Doe", birthDate, hireDate);
        System.out.println(employee1);
    }
}
