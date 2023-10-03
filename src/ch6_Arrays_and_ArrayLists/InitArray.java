package ch6_Arrays_and_ArrayLists;

/**
 * {@code InitArray} sınıfı, bir dizinin elemanlarını Java'da tamsayı dizileri için
 * varsayılan değerleri olan sıfıra nasıl başlatılacağını gösterir.
 * Bu, bir tamsayı dizisi oluşturur, sütun başlıklarını yazdırır ve ardından dizideki
 * her elemanın indeksini ve değerini yazdırır.
 */
public class InitArray {
    /**
     * {@code main} metodu programın giriş noktasıdır. Bu, bir tamsayı dizisi oluşturur
     * ve dizinin her elemanının indeksini ve değerini yazdırır.
     *
     * @param args Komut satırı argümanları (bu programda kullanılmaz).
     */
    public static void main(String[] args) {
        // array değişkenini bildirir ve bir dizi nesnesi ile başlatır
        int[] array = new int[10]; // Dizi nesnesini oluşturur
        System.out.printf("%s%8s%n", "İndeks", "Değer"); // Sütun başlıkları

        // Her dizinin elemanının değerini yazdırır
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
//----------------------------------------------

        // İlk değerler listesi her elemanın başlangıç değerini belirtir
        int[] array1 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        System.out.printf("%s%8s%n", "İndeks", "Değer"); // Sütun başlıkları

        // Her dizinin elemanının değerini yazdırır
        for (int counter = 0; counter < array1.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array1[counter]);
        }
//----------------------------------------------
        final int DIZI_UZUNLUGU = 10; // Sabit değeri bildirir
        int[] array2 = new int[DIZI_UZUNLUGU]; // Diziyi oluşturur
        // Her dizi elemanı için değeri hesaplar
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s%n", "İndeks", "Değer"); // Sütun başlıkları

        // Her dizinin elemanının değerini yazdırır
        for (int counter = 0; counter < array2.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array2[counter]);
        }
    }
}
