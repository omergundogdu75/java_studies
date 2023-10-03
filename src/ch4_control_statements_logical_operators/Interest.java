package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, bileşik faiz hesaplamalarını gerçekleştirir ve belirli bir yıl için depozitodaki miktarı hesaplar.
 */
public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0; // Faizden önceki başlangıç miktarı
        double rate = 0.05;

        // Başlıkları görüntüle
        System.out.printf("%s%20s%n", "Yıl", "Depozitodaki Miktar");

        // On yıl boyunca her bir yıl için depozitodaki miktarı hesaplayın
        for (int year = 0; year <= 10; ++year) {
            // Belirtilen yıl için yeni depozitodaki miktarı hesaplayın
            double amount = principal * Math.pow(1.0 + rate, year);

            // Yılı ve miktarı görüntüle
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
