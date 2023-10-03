package ch6_Arrays_and_ArrayLists;

/**
 * Bu sınıf, bir dizideki tamsayıları toplamak için geliştirilmiş for döngüsünün kullanımını gösterir.
 */
public class EnhancedForTest {
    /**
     * Ana yöntem, bir dizideki tamsayıları toplamak için geliştirilmiş for döngüsünü kullanır.
     *
     * @param args Komut satırı argümanları (bu örnekte kullanılmaz).
     */
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // Her öğenin değerini toplam değişkenine ekler
        for (int number : array) {
            total += number;
        }

        System.out.printf("Dizinin toplamı: %d%n", total);
    }
}
