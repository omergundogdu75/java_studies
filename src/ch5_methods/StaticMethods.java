package ch5_methods;

import java.security.SecureRandom;

public class StaticMethods {
    public static void main(String[] args) {

        System.out.println(Math.sqrt(900.0));
        double c = 13.0, d = 3.0, f = 4.0;
        System.out.println(Math.sqrt(c + d * f));
        //Matematik sınıfı içerisinde çeşitli statik metodlar bulunmaktadır.
        System.out.println(Math.max(c, Math.max(d, f)));
        System.out.println(Math.sqrt(4));

        int a = 4;
        double b = a; // widening
        System.out.println(b);
        double e = 4.5;
        int g = (int) e; //narrowing
        System.out.println(g);

        SecureRandom randomNumbers = new SecureRandom();
        System.out.println(randomNumbers.nextInt(4));

    }
}
