package ch5_methods;

import java.security.SecureRandom;

/**
 * Bu Java programı, altı yüzlü bir zarı 60.000.000 kez atar ve her bir yüzün kaç kez geldiğini hesaplar.
 * Güvenli rastgele sayılar üretmek için SecureRandom sınıfı kullanılır.
 * Zar atma işlemi rastgele gerçekleşir ve her atışın sonucu sayılır.
 * Sonuçlar, her bir zar yüzünün kaç kez geldiğini gösteren bir tablo olarak ekrana yazdırılır.
 */
public class RollDie {
    public static void main(String[] args) {
        // randomNumbers nesnesi güvenli rastgele sayılar üretecektir
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // 1'lerin sayısını sayar
        int frequency2 = 0; // 2'lerin sayısını sayar
        int frequency3 = 0; // 3'lerin sayısını sayar
        int frequency4 = 0; // 4'lerin sayısını sayar
        int frequency5 = 0; // 5'lerin sayısını sayar
        int frequency6 = 0; // 6'larin sayısını sayar

        // 60.000.000 kez zar at ve sonuçları say
        for (int roll = 1; roll <= 60_000_000; roll++) {
            int face = 1 + randomNumbers.nextInt(6); // 1 ila 6 arasında bir sayı

            // Yüz değeri 1-6 arasında hangi sayaca artırılacağını belirlemek için kullanılır
            switch (face) {
                case 1:
                    ++frequency1; // 1'lerin sayısını artır
                    break;
                case 2:
                    ++frequency2; // 2'lerin sayısını artır
                    break;
                case 3:
                    ++frequency3; // 3'lerin sayısını artır
                    break;
                case 4:
                    ++frequency4; // 4'lerin sayısını artır
                    break;
                case 5:
                    ++frequency5; // 5'lerin sayısını artır
                    break;
                case 6:
                    ++frequency6; // 6'ların sayısını artır
                    break;
            }
        }

        System.out.println("Face\tFrequency"); // başlık çıktısı
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);
    }
}
