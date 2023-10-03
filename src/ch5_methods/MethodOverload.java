package ch5_methods;

/**
 * Bu sınıf, aşırı yüklenmiş (overloaded) yöntem örneklerini içerir.
 * Aşırı yüklenmiş yöntemler, aynı isme sahip ancak farklı parametreler alan yöntemlerdir.
 * Bu sınıf, tamsayı ve ondalık sayılar için kare hesaplamalarını gösterir.
 *
 * @author [ÖMER GÜNDOĞDU]
 * @version [04.10.2023]
 */
public class MethodOverload {

    /**
     * Verilen bir tamsayının karesini hesaplar.
     *
     * @param intValue Kare alınacak tamsayı
     * @return Tamsayının karesi
     */
    public static int square(int intValue)
    {
        System.out.printf("%nCalled square with int argument: %d%n",
                intValue);
        return intValue * intValue;
    }

    /**
     * Verilen bir ondalık sayının karesini hesaplar.
     *
     * @param doubleValue Kare alınacak ondalık sayı
     * @return Ondalık sayının karesi
     */
    public static double square(double doubleValue)
    {
        System.out.printf("%nCalled square with double argument: %f%n",
                doubleValue);
        return doubleValue * doubleValue;
    }

    // Test sınıfı
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
    }
}
