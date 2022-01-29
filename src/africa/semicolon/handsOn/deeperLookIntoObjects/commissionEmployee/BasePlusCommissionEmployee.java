package africa.semicolon.handsOn.deeperLookIntoObjects.commissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be greater than 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) throw new IllegalArgumentException("Base aslary must be greater than 0.0");
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
//    @Override
//    public String toString() {
//        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-slaried commission employee", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(), "commission rate ", getCommissionRate(), "base salary ", getBaseSalary());
//    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f%n%s: %.2f", "base salaried", super.toString(),"base salary", getBaseSalary(), "Earnings", earnings());
    }
}
