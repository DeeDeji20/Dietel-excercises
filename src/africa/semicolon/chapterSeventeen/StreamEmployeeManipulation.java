package africa.semicolon.chapterSeventeen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamEmployeeManipulation {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Dee", "Deji", "I get", 10000),
                new Employee("Lota", "Dev", "I get u", 10400),
                new Employee("Esther", "Bae", "My girl", 10000)
        };

        List<Employee> myEmployees =Arrays.asList(employees);
        Predicate<Employee> isInvestor = (department)-> department.getDepartment().equals("I get");
        System.out.println( myEmployees.stream().filter(isInvestor).sorted(Comparator.comparing(Employee::getFirstNmae)).findFirst().get());
    }
}

class Employee{
    private String firstNmae;
    private String lastName;
    private String department;
    private int salary;

    public Employee(String firstNmae, String lastName, String department, int salary) {
        this.firstNmae = firstNmae;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstNmae='" + firstNmae + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
