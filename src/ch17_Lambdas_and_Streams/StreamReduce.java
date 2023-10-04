package ch17_Lambdas_and_Streams;

import java.util.stream.IntStream;

/**
 * {@code StreamReduce} sınıfı, Java akışlarını kullanarak {@link IntStream} ve
 * {@link IntStream#range(int, int)} ve {@link IntStream#sum()} yöntemlerini kullanarak
 * 1'den 10'a kadar olan tamsayıların toplamını hesaplamanın nasıl yapılacağını göstermektedir.
 */
public class StreamReduce {
    /**
     * Ana metod, programın giriş noktasıdır. Java akışlarını kullanarak 1'den 10'a kadar olan tamsayıların
     * toplamını hesaplar ve sonucu yazdırır.
     *
     * @param args Komut satırı argümanları (bu programda kullanılmaz).
     */
    public static void main(String[] args) {
        // IntStream ile 1 ile 10 arasındaki tamsayıların toplamını hesapla.
        System.out.printf("1 ile 10 arasındaki tamsayıların toplamı: %d%n",
                IntStream.range(1, 10).sum());
    }
}
