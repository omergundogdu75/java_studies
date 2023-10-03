package ch6_Arrays_and_ArrayLists;

/**
 * Bu sınıf, öğrenci anketi sonuçlarını analiz eder ve yanıtların frekansını hesaplar.
 */
public class StudentPoll {
    /**
     * Ana yöntem, öğrenci anketi sonuçlarını analiz eder ve yanıtların frekansını hesaplar.
     *
     * @param args Komut satırı argümanları (bu örnekte kullanılmaz).
     */
    public static void main(String[] args) {
        // Öğrenci yanıt dizisi (genellikle çalışma zamanında girilir)
        int[] responses =
                {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        int[] frequency = new int[6]; // frekans sayacı olarak kullanılacak dizi

        // Her bir yanıt için, responses dizisinden yanıtı seç ve bu değeri frekans endeks olarak kullanarak artırılacak öğe olarak belirle
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // toString yöntemini çağırır
                System.out.printf(" responses[%d] = %d%n%n",
                        answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Değerlendirme", "Frekans");

        // Her dizi öğesinin değerini yazdır
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}
