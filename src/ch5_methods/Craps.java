package ch5_methods;

import java.security.SecureRandom;

/**
 * Bu Java programı, zar oyunu olan Craps'ı simüle eder.
 * Güvenli rastgele sayılar üretmek için SecureRandom sınıfı kullanılır.
 * Oyuncunun zarları atmasını ve oyunun sonucunu belirler.
 */
public class Craps {
    // method rollDice için kullanılacak güvenli rastgele sayı üreteci oluşturur
    private static final SecureRandom randomNumbers = new SecureRandom();

    // oyun durumunu temsil eden sabitler içeren enum türü
    private enum Status { CONTINUE, WON, LOST };

    // zar oyununun yaygın atışlarını temsil eden sabitler
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // bir Craps oyunu oynar
    public static void main(String[] args) {
        int myPoint = 0; // ilk atışta kazanma veya kaybetme yoksa puan
        Status gameStatus; // CONTINUE, WON veya LOST içerebilir
        int sumOfDice = rollDice(); // zarların ilk atışı
        // ilk atışa dayalı olarak oyun durumunu ve puanı belirle
        switch (sumOfDice) {
            case SEVEN: // ilk atışta 7 ile kazanma
            case YO_LEVEN: // ilk atışta 11 ile kazanma
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // ilk atışta 2 ile kaybetme
            case TREY: // ilk atışta 3 ile kaybetme
            case BOX_CARS: // ilk atışta 12 ile kaybetme
                gameStatus = Status.LOST;
                break;
            default: // kazanma veya kaybetme yoksa puanı hatırla
                gameStatus = Status.CONTINUE; // oyun bitmedi
                myPoint = sumOfDice; // puanı hatırla
                System.out.printf("Puan %d%n", myPoint);
                break;
        }
        // oyun tamamlanana kadar
        while (gameStatus == Status.CONTINUE) { // WON veya LOST değilse
            sumOfDice = rollDice(); // zarları tekrar at
            // oyun durumunu belirle
            if (sumOfDice == myPoint) { // puanı kazanarak kazanma
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) { // puanı önce 7 atarak kaybetme
                    gameStatus = Status.LOST;
                }
            }
        }
        // kazandı veya kaybetti mesajını göster
        if (gameStatus == Status.WON) {
            System.out.println("Oyuncu kazandı");
        } else {
            System.out.println("Oyuncu kaybetti");
        }
    }
    // zar at, toplamı hesapla ve sonuçları göster
    public static int rollDice() {
        // rastgele zar değerlerini seç
        int die1 = 1 + randomNumbers.nextInt(6); // ilk zar atışı
        int die2 = 1 + randomNumbers.nextInt(6); // ikinci zar atışı
        int sum = die1 + die2; // zar değerlerinin toplamı
        // bu atışın sonuçlarını göster
        System.out.printf("Oyuncu %d + %d = %d attı%n", die1, die2, sum);
        return sum;
    }
}
