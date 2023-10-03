package ch5_methods;

import java.util.Scanner;

/**
 * Bu Java programı, üç adet double parametresi ile çağrılan "maximum" adlı bir metodu içerir.
 * Kullanıcıdan alınan üç double değeri karşılaştırarak, en büyük değeri bulur ve ekrana yazdırır.
 */
public class MaximumFinder {
    public static void main(String[] args) {
        // Kullanıcıdan alınan girdiler için bir Scanner oluşturun
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç adet ondalık değeri boşluklarla ayrılmış olarak isteyin ve alın
        System.out.print(
                "Boşluklarla ayrılmış üç ondalık değeri girin: ");
        double number1 = input.nextDouble(); // İlk double değeri oku
        double number2 = input.nextDouble(); // İkinci double değeri oku
        double number3 = input.nextDouble(); // Üçüncü double değeri oku

        // En büyük değeri belirle
        double result = maximum(number1, number2, number3);

        // En büyük değeri ekrana yazdır
        System.out.println("En büyük değer: " + result);
    }

    /**
     * Üç double parametresinin en büyüğünü döndüren metot.
     *
     * @param x İlk double değer
     * @param y İkinci double değer
     * @param z Üçüncü double değer
     * @return En büyük double değeri
     */
    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // Başlangıçta x'in en büyük olduğunu varsayalım

        // Y'nin maximumValue'dan daha büyük olup olmadığını belirle
        if (y > maximumValue) {
            maximumValue = y;
        }

        // Z'nin maximumValue'dan daha büyük olup olmadığını belirle
        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
}
