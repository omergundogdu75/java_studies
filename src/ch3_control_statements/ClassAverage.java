package ch3_control_statements;

import java.util.Scanner;

/**
 * Bu Java programı, kullanıcı tarafından girilen 10 notun toplamını ve sınıfın ortalamasını hesaplar.
 */
public class ClassAverage {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için bir Scanner oluşturulur.
        Scanner input = new Scanner(System.in);

        // Başlangıç aşaması
        int total = 0; // Kullanıcı tarafından girilen notların toplamını başlatır
        int gradeCounter = 1; // Bir sonraki girilecek not sayısını başlatır

        // İşlem aşaması, sayaç kontrollü yinelemeyi kullanır
        while (gradeCounter <= 10) { // 10 kez döner
            System.out.print("Notu girin: "); // Kullanıcıya talimat verir
            int grade = input.nextInt(); // Bir sonraki notu alır
            total += grade; // Notu toplama ekler
            gradeCounter++; // Sayaç değerini 1 artırır
        }

        // Sonlandırma aşaması
        int average = total / 10; // İnteger bölme sonucunda bir tam sayı elde edilir

        // Toplam not ve sınıf ortalamasını görüntüler
        System.out.printf("%nTüm 10 notun toplamı %d%n", total);
        System.out.printf("Sınıf ortalaması %d%n", average);
    }
}
