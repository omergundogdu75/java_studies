package ch3_control_statements;

import java.util.Scanner;

/**
 * Bu Java programı, sınav sonuçlarını analiz etmek için iç içe geçmiş kontrol ifadelerini kullanır.
 */
public class Analysis {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için bir Scanner oluşturulur.
        Scanner input = new Scanner(System.in);

        // Değişkenlerin başlangıç değerleri atanır.
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // 10 öğrenciyi işlemek için bir sayaç kontrollü döngü kullanılır.
        while (studentCounter <= 10) {
            // Kullanıcıdan girdi istenir ve kullanıcıdan değer alınır.
            System.out.println("Sonucu girin (1 == geçti, 2 == kaldı):");
            int result = input.nextInt();

            // if...else, while döngüsü içinde yer alır
            if (result == 1) {
                passes += 1;
            } else {
                failures += 1;
            }
            // studentCounter'ı artırarak döngünün sonunda sonlanmasını sağlar
            studentCounter += 1;
        }
        // Sonlandırma aşaması; sonuçları hazırlar ve görüntüler
        System.out.printf("Geçenler: %d%nKalanlar: %d%n", passes, failures);

        // 8'den fazla öğrencinin geçtiği kontrol edilir
        if (passes > 8) {
            System.out.println("Eğitmene bonus!");
        }
    }
}
