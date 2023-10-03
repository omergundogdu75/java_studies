package ch4_control_statements_logical_operators;

import java.util.Scanner;

/**
 * Bu Java programı, kullanıcıdan alınan notları değerlendirir ve harf notlarına göre sınıflandırır.
 */
public class LetterGrades {
    public static void main(String[] args) {
        int total = 0; // Notların toplamı
        int gradeCounter = 0; // Girilen not sayısı
        int aCount = 0; // A notlarının sayısı
        int bCount = 0; // B notlarının sayısı
        int cCount = 0; // C notlarının sayısı
        int dCount = 0; // D notlarının sayısı
        int fCount = 0; // F notlarının sayısı

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n %s%n %s%n",
                "0-100 arasındaki tam sayı notlarını girin.",
                "Girişi sonlandırmak için dosya sonu göstergesini kullanın:",
                "UNIX/Linux/macOS üzerinde <Ctrl> d sonra Enter tuşuna basın",
                "Windows üzerinde <Ctrl> z sonra Enter tuşuna basın");

        // Kullanıcı dosya sonu göstergesini girene kadar döngüyü çalıştır
        while (input.hasNext()) {
            int grade = input.nextInt(); // Notu oku
            total += grade; // Notu toplama ekle
            ++gradeCounter; // Not sayısını artır

            // Uygun harf notu sayacını artır
            switch (grade / 10) {
                case 9: // Not 90 ile 100 arasındaysa
                case 10: // (9 ile 10 arasındaysa)
                    ++aCount;
                    break; // switch'ten çık
                case 8: // Not 80 ile 89 arasındaysa
                    ++bCount;
                    break; // switch'ten çık
                case 7: // Not 70 ile 79 arasındaysa
                    ++cCount;
                    break; // switch'ten çık
                case 6: // Not 60 ile 69 arasındaysa
                    ++dCount;
                    break; // switch'ten çık
                default: // Not 60'dan küçükse
                    ++fCount;
                    break; // İsteğe bağlı; switch'ten çıkar her durumda
            }
        }

        // Not raporunu görüntüle
        System.out.printf("%nNot Raporu:%n");

        // Kullanıcı en az bir not girdiyse...
        if (gradeCounter != 0) {
            // Girilen tüm notların ortalamasını hesapla
            double average = (double) total / gradeCounter;

            // Sonuçların özetini görüntüle
            System.out.printf("Girilen %d notların toplamı %d%n",
                    gradeCounter, total);

            System.out.printf("Sınıf ortalaması %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Her notu alan öğrenci sayısı:",
                    "A: ", aCount, // A notlarının sayısını görüntüle
                    "B: ", bCount, // B notlarının sayısını görüntüle
                    "C: ", cCount, // C notlarının sayısını görüntüle
                    "D: ", dCount, // D notlarının sayısını görüntüle
                    "F: ", fCount); // F notlarının sayısını görüntüle
        } else { // Not girilmemişse, uygun mesajı görüntüle
            System.out.println("Not girilmemiştir");
        }
    }
}
