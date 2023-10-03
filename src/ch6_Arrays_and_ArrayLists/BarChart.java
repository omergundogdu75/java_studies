package ch6_Arrays_and_ArrayLists;

/**
 * Bu sınıf, bir derecelendirme dağılımını temsil eden bir çubuk grafik oluşturur.
 */
public class BarChart {
    /**
     * Ana yöntem, bir derecelendirme dağılımını temsil eden bir çubuk grafiği oluşturur ve ekrana yazdırır.
     *
     * @param args Komut satırı argümanları (bu örnekte kullanılmaz).
     */
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Derecelendirme dağılımı:");

        // Her dizi öğesi için, grafikte bir çubuk oluşturur
        for (int counter = 0; counter < array.length; counter++) {
            // Çubuk etiketini yazdır ("00-09: ", ..., "90-99: ", "100: ")
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                        counter * 10, counter * 10 + 9);
            }

            // Yıldız (*) işareti ile bir çubuk çizer
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
