package ch6_Arrays_and_ArrayLists;

/**
 * {@code PassArray} sınıfı, Java'da dizileri ve dizi elemanlarını yöntemlere iletmenin etkilerini gösterir.
 * Bu sınıf, bir tamsayı dizisi oluşturur, diziyi ve elemanlarını değiştiren yöntemleri çağırır ve bu değişikliklerin etkilerini gösterir.
 */
public class PassArray {
    /**
     * main metodu programın giriş noktasıdır. Bu metod, bir tamsayı dizisi oluşturur,
     * diziyi değiştirmek için yöntemleri çağırır ve bu değişikliklerin etkilerini gösterir.
     * @param args Komut satırı argümanları (bu programda kullanılmaz).
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.printf(
                "Tüm diziyi referans olarak iletmek etkileri:%n" +
                        "Orijinal dizi değerleri:%n");

        // Orijinal dizi elemanlarını yazdır
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        modifyArray(array); // Diziyi referans olarak iletiyoruz
        System.out.printf("%n%nDeğiştirilen dizinin değerleri:%n");

        // Değiştirilmiş dizi elemanlarını yazdır
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        System.out.printf(
                "%n%nDizi elemanı değerini iletmek etkileri:%n" +
                        "modifyElement çağrılmadan önce array[3]: %d%n", array[3]);

        modifyElement(array[3]); // array[3] elemanını değiştirmeye çalışıyoruz
        System.out.printf(
                "modifyElement çağrıldıktan sonra array[3]: %d%n", array[3]);
    }

    /**
     * Bu yöntem, bir dizinin her elemanını 2 ile çarpar.
     * @param array2 Değiştirilecek tamsayı dizisi.
     */
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    /**
     * Bu yöntem, argümanı 2 ile çarpmayı dener.
     * Ancak, Java'da bu işlem orijinal değeri etkilemez.
     * @param element Değiştirilmeye çalışılan tamsayı elemanı.
     */
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf(
                "modifyElement içindeki element değeri: %d%n", element);
    }
}

// Pass-By-Value vs. Pass-By-Reference
//Bir argüman değere göre iletildiğinde, argümanın değerinin bir kopyası çağrılan yönteme iletilir. Çağrılan yöntem
// yalnızca kopyayla çalışır. Çağrılan yöntemin kopyasında yapılan değişiklikler, arayandaki orijinal değişkenin
// değerini etkilemez. Bir argüman referans olarak iletildiğinde, çağrılan yöntem çağırandaki argümanın değerine
// doğrudan erişebilir ve gerekirse bu verileri değiştirebilir. Referansa göre geçiş, muhtemelen büyük miktarlarda
// veriyi kopyalama ihtiyacını ortadan kaldırarak performansı artırır.

//Diğer bazı dillerden farklı olarak Java, değere göre geçiş veya referansa göre geçiş seçmenize izin vermez; tüm argümanlar değere göre iletilir.
