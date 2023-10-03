package ch2_introduction_to_java_application_io_and_operators;

import java.util.Scanner;

/**
 * Bu program, kullanıcının girdiği iki tamsayının karşılaştırmasını yapar ve sonuçları görüntüler.
 */
public class Comparison {
    /**
     * Programın başlangıç noktasıdır. İşlem, buradan başlar.
     *
     */
    public static void main(String[] args) {

        // Kullanıcıdan girdi almak için bir tarayıcı (Scanner) oluşturulur.
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci tamsayıyı giriniz: "); // Kullanıcıya talimat verir
        int number1 = input.nextInt(); // Kullanıcıdan ilk sayıyı okur

        System.out.print("İkinci tamsayıyı giriniz: "); // Kullanıcıya talimat verir
        int number2 = input.nextInt(); // Kullanıcıdan ikinci sayıyı okur

        if (number1 == number2) System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2) System.out.printf("%d != %d%n", number1, number2);
        if (number1 < number2) System.out.printf("%d < %d%n", number1, number2);
        if (number1 > number2) System.out.printf("%d > %d%n", number1, number2);
        if (number1 <= number2) System.out.printf("%d <= %d%n", number1, number2);
        if (number1 >= number2) System.out.printf("%d >= %d%n", number1, number2);

    } // main metodunun sonu
} // Comparison sınıfının sonu
