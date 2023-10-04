package ch17_Lambdas_and_Streams;

import java.util.stream.IntStream;

/**
 * {@code StreamFilterMapReduce} sınıfı, Java akışlarını kullanarak 1 ile 10 arasındaki çift tamsayıların üç katlarının
 * toplamını hesaplamanın nasıl yapılacağını göstermektedir.
 */
public class StreamFilterMapReduce {
    /**
     * Ana metod, programın giriş noktasıdır. Java akışlarını kullanarak 1 ile 10 arasındaki çift tamsayıların üç katlarının
     * toplamını hesaplar ve sonucu yazdırır.
     *
     * @param args Komut satırı argümanları (bu programda kullanılmaz).
     */
    public static void main(String[] args) {
        // 1 ile 10 arasındaki çift tamsayıların üç katlarının toplamını hesapla.
        System.out.printf("1 ile 10 arasındaki çift tamsayıların üç katlarının toplamı: %d%n",
                IntStream.rangeClosed(1, 10)
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * 3)
                        .sum());
    }
}
