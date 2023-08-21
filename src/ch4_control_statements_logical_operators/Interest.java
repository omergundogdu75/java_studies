package ch4_control_statements_logical_operators;

// Compound-interest calculations with for.
public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest
        double rate = 0.05;

        //display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        // calculate amount on deposit for each of ten years
        for (int year = 0; year <= 10; ++year) {
            // calculate new amount on deposit for specified year
            double amount = principal * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
        }

    }
}
