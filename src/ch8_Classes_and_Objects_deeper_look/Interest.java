package ch8_Classes_and_Objects_deeper_look;

// Fig. 8.16: Interest.java
// Compound-interest calculations with BigDecimal.

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
    public static void main(String args[]) {
// initial principal amount before interest
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++) {
// calculate new amount for specified year
            BigDecimal amount =
                    principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            //"rate.add(BigDecimal.ONE)" ifadesi, "rate" değerine 1 ekleyerek 1.05 değerini içeren bir
            // "BigDecimal" nesnesi oluşturur. Bu, Fig. 5.6'daki 1.0 + "rate" ifadesine karşılık gelir.

            // display the year and the amount
            System.out.printf("%4d%20s%n", year,NumberFormat.getCurrencyInstance().format(amount)
                    );
        }
    }
}
