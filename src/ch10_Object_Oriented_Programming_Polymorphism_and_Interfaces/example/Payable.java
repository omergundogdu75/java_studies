package ch10_Object_Oriented_Programming_Polymorphism_and_Interfaces.example;

public interface Payable {
    double getPaymentAmount();

    default void restart() {
        System.out.println("Restart atıldı.");
    }
}

