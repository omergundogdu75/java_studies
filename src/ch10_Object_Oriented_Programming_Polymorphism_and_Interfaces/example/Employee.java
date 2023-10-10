package ch10_Object_Oriented_Programming_Polymorphism_and_Interfaces.example;

public class Employee implements Payable {
    private String employeeId;
    private String name;
    private double salary;

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    // Diğer getter ve setter metodları...
}
