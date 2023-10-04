package ch17_Lambdas_and_Streams;

import java.util.stream.IntStream;

/**
 * {@code StreamMapReduce} sınıfı, Java akışlarını kullanarak 2 ile 20 arasındaki çift tamsayıların toplamını
 * hesaplamanın nasıl yapılacağını göstermektedir.
 */
public class StreamMapReduce {
    /**
     * Ana metod, programın giriş noktasıdır. Java akışlarını kullanarak 2 ile 20 arasındaki çift tamsayıların
     * toplamını hesaplar ve sonucu yazdırır.
     *
     * @param args Komut satırı argümanları (bu programda kullanılmaz).
     */
    public static void main(String[] args) {
        // 2 ile 20 arasındaki çift tamsayıların toplamını hesapla.
        System.out.printf("2 ile 20 arasındaki çift tamsayıların toplamı: %d%n",
                IntStream.rangeClosed(1, 10)
                        .map((int x) -> {
                            return x * 2;
                        })
                        .sum());
    }
}
