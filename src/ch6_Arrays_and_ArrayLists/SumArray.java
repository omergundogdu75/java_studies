package ch6_Arrays_and_ArrayLists;

/**
 * Bu sınıf, bir tamsayı dizisindeki elemanların toplamını hesaplar.
 */
public class SumArray {
    /**
     * Ana yöntem, bir tamsayı dizisindeki elemanların toplamını hesaplar ve sonucu ekrana yazdırır.
     *
     * @param args Komut satırı argümanları (bu örnekte kullanılmaz).
     */
    public static void main(String[] args) {
        // Bir tamsayı dizisi oluşturur
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0; // Elemanların toplamını saklamak için bir değişken

        // Dizi içindeki her elemanın değerini toplam değişkenine ekler
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }

        // Dizi elemanlarının toplamını ekrana yazdırır
        System.out.printf("Dizi elemanlarının toplamı: %d%n", total);
    }
}
