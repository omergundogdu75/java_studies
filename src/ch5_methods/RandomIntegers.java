package ch5_methods;

import java.security.SecureRandom;

/**
 * Bu Java programı, 1 ile 6 arasında güvenli rastgele tam sayılar üretir.
 * Güvenli rastgele sayılar üretmek için SecureRandom sınıfı kullanılır.
 * 1 ile 6 arasında rastgele bir tam sayı üretilir ve bu değerler ekrana yazdırılır.
 * Her 5 tam sayıda bir yeni bir satır başlatılır.
 */
public class RandomIntegers {
    public static void main(String[] args) {
        // randomNumbers nesnesi güvenli rastgele sayılar üretecektir
        SecureRandom randomNumbers = new SecureRandom();

        // 20 kez dön
        for (int counter = 1; counter <= 20; counter++) {
            // 1 ile 6 arasında rastgele bir tam sayı seç
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face); // üretilen değeri ekrana yazdır

            // Eğer sayaç 5'e bölünebilirse yeni bir çıktı satırı başlat
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}
