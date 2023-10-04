package ch6_Arrays_and_ArrayLists;

/**
 * {@code InitArray2} sınıfı, komut satırı argümanları kullanarak bir diziyi başlatmanın nasıl yapılacağını gösterir.
 * Eğer uygun sayıda komut satırı argümanı sağlanmazsa, kullanıcıya bir hata mesajı gösterilir.
 * Aksi takdirde, belirtilen boyutta bir dizi oluşturulur, başlangıç değeri ve artış değeri komut satırı argümanlarından alınır
 * ve her dizi elemanının değeri hesaplanarak ekrana yazdırılır.
 */
public class InitArray2 {
    /**
     * Bu metod, komut satırı argümanlarını kullanarak bir tamsayı dizisini başlatır ve değerlerini hesaplar.
     * @param args Komut satırı argümanları; dizi boyutu, başlangıç değeri ve artış değeri içermelidir.
     */
    public static void main(String[] args) {
        // Komut satırı argümanlarının sayısını kontrol et
        if (args.length != 3) {
            System.out.printf(
                    "Hata: Lütfen tam komutu, içerisinde%n" +
                            "dizi boyutunu, başlangıç değerini ve artış değerini ekleyerek tekrar girin.%n");
        } else {
            // Dizi boyutunu ilk komut satırı argümanından al
            int arrayLength = Integer.parseInt(args[0]);

            int[] array = new int[arrayLength];

            // Başlangıç değeri ve artış değerini komut satırı argümanlarından al
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // Her dizi elemanının değerini hesapla
            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;
            }

            System.out.printf("%s%8s%n", "Index", "Value");

            // Dizi indeksini ve değerini ekrana yazdır
            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}
