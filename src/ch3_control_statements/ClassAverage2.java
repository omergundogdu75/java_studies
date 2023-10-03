package ch3_control_statements;

import java.util.Scanner;

/**
 * Bu Java programı, kullanıcı tarafından girilen sınıf notlarının toplamını ve ortalama değerini hesaplar.
 * Kullanıcı -1 değerini girene kadar notları alır.
 */
public class ClassAverage2 {

    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için bir Scanner oluşturulur.
        Scanner input = new Scanner(System.in);

        // Başlangıç aşaması
        int total = 0; // Notların toplamını başlatır
        int gradeCounter = 0; // Şu ana kadar girilen not sayısını başlatır

        // İşlem aşaması
        // Kullanıcıdan not almak için giriş yapın ve kullanıcıdan not alın
        System.out.print("Notu girin veya çıkmak için -1 girin: ");
        int grade = input.nextInt();

        // Kullanıcı tarafından girilen -1 değeri okunana kadar döner
        while (grade != -1) {
            total = total + grade; // Notu toplama ekler
            gradeCounter = gradeCounter + 1; // Sayaç değerini artırır

            System.out.print("Notu girin veya çıkmak için -1 girin: ");
            grade = input.nextInt();
        }

        // Sonlandırma aşaması
        // Kullanıcı en az bir not girdiyse...
        if (gradeCounter != 0) {
            // Notların ortalama değerini hesaplamak için ondalıklı sayı kullanılır
            double average = (double) total / gradeCounter;
            // Toplamı ve ortalama değeri (iki ondalık hane hassasiyetiyle) görüntüler
            System.out.printf("%nGirilen %d notun toplamı %d%n", gradeCounter, total);
            System.out.printf("Sınıf ortalaması %.2f%n", average);
        } else {
            // Hiç not girilmediğinden uygun mesajı görüntüler
            System.out.println("Hiç not girilmedi");
        }
    }
}
