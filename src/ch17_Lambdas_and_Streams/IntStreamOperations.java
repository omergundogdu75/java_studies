package ch17_Lambdas_and_Streams;

// Demonstrating IntStream operations.

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Bu sınıf, IntStream kullanarak bazı temel işlemleri ve işlemlerini sergiler.
 * İlk olarak, bir dizi tamsayıyı işler, ardından bu tamsayılar üzerinde çeşitli işlemler gerçekleştirir.
 */
public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // Orijinal değerleri görüntüle
        System.out.print("Orijinal değerler: ");
        System.out.println(
                IntStream.of(values)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));

        // Değerlerin sayısı, minimum, maksimum, toplam ve ortalama değeri
        System.out.printf("%nSayı: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n",
                IntStream.of(values).min().getAsInt());
        System.out.printf("Maks: %d%n",
                IntStream.of(values).max().getAsInt());
        System.out.printf("Toplam: %d%n", IntStream.of(values).sum());
        System.out.printf("Ortalama: %.2f%n",
                IntStream.of(values).average().getAsDouble());

        // reduce yöntemi ile değerlerin toplamı
        System.out.printf("%nReduce yöntemi ile toplam: %d%n",
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y));

        // reduce yöntemi ile değerlerin çarpımı
        System.out.printf("Reduce yöntemi ile çarpım: %d%n",
                IntStream.of(values)
                        .reduce((x, y) -> x * y).getAsInt());

        // Değerlerin karelerinin toplamı map ve sum yöntemleri ile hesaplanır
        System.out.printf("Karelerin toplamı map ve sum ile: %d%n%n",
                IntStream.of(values).map(x -> x * x)
                        .sum());

        // Sıralı düzende elemanları görüntüleme
        System.out.printf("Sıralı düzende görüntülenen değerler: %s%n",
                IntStream.of(values).sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));

        System.out.printf("İstatistikler: %s%n",
                IntStream.of(values).summaryStatistics());
    }
}
