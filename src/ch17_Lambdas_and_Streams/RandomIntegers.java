package ch17_Lambdas_and_Streams;

import java.security.SecureRandom;
import java.util.stream.Collectors;

/**
 * {@code RandomIntegers} sınıfı, güvenli rasgele tamsayılar üreterek Java akışlarını kullanarak bu tamsayıları
 * farklı satırlarda veya aynı satırda görüntülemenin nasıl yapılacağını gösterir.
 */
public class RandomIntegers {
    /**
     * Ana metod, programın giriş noktasıdır. Güvenli rasgele tamsayılar üreterek bu tamsayıları farklı satırlarda
     * ve aynı satırda görüntüler.
     *
     * @param args Komut satırı argümanları (bu programda kullanılmaz).
     */
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        // Farklı satırlarda 10 rasgele tamsayıyı görüntüle
        System.out.println("Farklı satırlarda rasgele tamsayılar: ");
        randomNumbers.ints(10, 1, 7) // intStream oluşturuldu.
                .forEach(System.out::println); //System.out::println ifadesi x->x -> System.out.println(x) eşittir.

        // Aynı satırda 10 rasgele tamsayıyı görüntüle
        // Bu, her tamsayıyı bir nesne akışına (Stream<Object>) dönüştürmek için kullanılır.
        // String::valueOf, tamsayıları String'e dönüştüren bir fonksiyon referansıdır.
        // Bu, her tamsayıyı String olarak dönüştürmek için kullanılır.
        //.collect(Collectors.joining(" ")): Bu, akıştaki tüm String öğelerini birleştirerek
        // tek bir String oluşturan bir koleksiyon işlemidir. " " ifadesi,
        // bu öğeleri birleştirirken aralarına boşluk bırakılmasını sağlar.
        // Sonuçta, bu satır, tüm rasgele tamsayıları birleştirilmiş bir String olarak döndürür.

        String numbers = randomNumbers.ints(10, 1, 7)
                .mapToObj(String::valueOf) //String::valueOf => x -> String.valueOf(x)
                .collect(Collectors.joining(" "));
        System.out.printf("%nAynı satırda rasgele tamsayılar: %s%n", numbers);
    }
}
