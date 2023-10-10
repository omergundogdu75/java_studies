package ch10_Object_Oriented_Programming_Polymorphism_and_Interfaces;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        if (baseSalary < 0.0) { // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        }

        this.baseSalary = baseSalary;

    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) { // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        }

        this.baseSalary = baseSalary;

    }

    // return base salary


    public double getBaseSalary() {
        return baseSalary;
    }

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }

}
