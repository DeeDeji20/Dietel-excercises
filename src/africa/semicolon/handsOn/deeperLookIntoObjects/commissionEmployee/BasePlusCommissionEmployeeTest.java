package africa.semicolon.handsOn.deeperLookIntoObjects.commissionEmployee;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Dee", "Oladeji", "123-234", 2000, .01, 1200);
        System.out.println("Employee information obtained by get metods: ");
        String result =employee.toString();
        System.out.println(result);
    }

}
