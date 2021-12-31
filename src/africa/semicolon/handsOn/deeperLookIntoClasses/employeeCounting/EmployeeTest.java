package africa.semicolon.handsOn.deeperLookIntoClasses.employeeCounting;

public class EmployeeTest {
    public static void main(String[] args) {
       int count = Employee.getCount();
        System.out.printf("Employees before instantiation: %d%n", count);

        Employee employee1 = new Employee("Dee", "Deji");
        Employee employee2 = new Employee("John", "Doe");
        int employee1Count =employee1.getCount();
        int employee2Count = employee2.getCount();
        System.out.printf("%nEmployee after instantiation: %n");
        System.out.printf("via employee1.getCount(): %d%n", employee1Count);
        System.out.printf("via employee2.getCount(): %d%n", employee2Count);
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());
        System.out.printf("%nEmployee1 : %s%s%n", employee1.getFirstName(), employee1.getLastName());
        System.out.printf("%nEmployee2 : %s%s%n", employee2.getFirstName(), employee2.getLastName());
    }
}
