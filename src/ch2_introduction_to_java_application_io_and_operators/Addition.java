package ch2_introduction_to_java_application_io_and_operators;

import java.util.Scanner;

/**
 * Bu program, kullanıcının girdiği iki tamsayının toplamını hesaplar ve sonucu görüntüler.
 */
public class Addition {
    /**
     * Programın başlangıç noktasıdır. İşlem, buradan başlar.
     *
     */
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için bir tarayıcı (Scanner) oluşturulur.
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci tamsayıyı giriniz: ");
        int number1 = input.nextInt(); // Kullanıcıdan ilk sayıyı okur

        System.out.print("İkinci tamsayıyı giriniz: ");
        int number2 = input.nextInt(); // Kullanıcıdan ikinci sayıyı okur

        int sum = number1 + number2; // Sayıları toplar, sonucu 'sum' değişkenine kaydeder

        // Toplamı ekrana formatlı bir şekilde görüntüler
        System.out.printf("Toplam %d%n", sum);
    } // main metodunun sonu
} // Addition sınıfının sonu
