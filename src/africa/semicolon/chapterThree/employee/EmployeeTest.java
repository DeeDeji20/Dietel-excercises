package africa.semicolon.chapterThree.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee adeola = new Employee("", "", 0.0);
        Employee john = new Employee("", "", 0.0);

        System.out.printf("First name: %s%n", adeola.getFirstName());

        System.out.printf("Last name: %s%n", adeola.getLastName());

        System.out.printf("Salary: %.2f%n", adeola.getSalary());



        adeola.setFirstName("Adeola");
        adeola.setLastName("Oladeji");
        adeola.setSalary(300);

        john.setFirstName("John");
        john.setLastName("Doe");
        john.setSalary(500);


        System.out.println("=".repeat(25));

        System.out.printf("First name: %s%n", adeola.getFirstName());

        System.out.printf("Last name: %s%n", adeola.getLastName());

        System.out.printf("Salary: %.2f%n", adeola.getSalary());

        System.out.printf("Yearly salary: %.2f%n", adeola.employeeYearlySalary());

        System.out.printf("Salary after raise of 10%% is %.2f: %n", adeola.employeeSalaryAfterTenPercentRaise());


        System.out.println("=".repeat(25));

        System.out.printf("First name: %s%n", john.getFirstName());

        System.out.printf("Last name: %s%n", john.getLastName());

        System.out.printf("Salary: %.2f%n", john.getSalary());

        System.out.printf("Yearly salary: %.2f%n", john.employeeYearlySalary());

        System.out.printf("Salary after raise of 10%% is %.2f: %n", john.employeeSalaryAfterTenPercentRaise());
    }
}
