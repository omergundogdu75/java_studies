package ch6_Arrays_and_ArrayLists;

/**
 * {@code VarargsTest} sınıfı, değişken uzunluklu argüman listelerinin nasıl kullanılacağını gösterir.
 * Bu sınıf, bir dizi double değerini alarak bu değerlerin ortalamasını hesaplayan bir yöntemi içerir.
 */
public class VarargsTest {
    /**
     * Verilen double değerlerinin ortalamasını hesaplar.
     * @param numbers Ortalama hesaplanacak double değerleri. Değişken uzunluklu argüman listesi olarak kabul edilir.
     * @return Verilen double değerlerinin ortalaması.
     */
    public static double average(double... numbers) {
        double total = 0.0;

        // Enhance for döngüsü kullanarak toplamı hesapla
        for (double d : numbers) {
            total += d;
        }

        return total / numbers.length;
    }

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",
                d1, d2, d3, d4);

        System.out.printf("d1 ve d2'nin ortalaması %.1f%n",
                average(d1, d2));
        System.out.printf("d1, d2 ve d3'ün ortalaması %.1f%n",
                average(d1, d2, d3));
        System.out.printf("d1, d2, d3 ve d4'ün ortalaması %.1f%n",
                average(d1, d2, d3, d4));
    }
}
