package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, bir for döngüsünü kullanarak belirli bir aralıktaki sayıları ekrana basar.
 */
public class ForCounter {
    public static void main(String[] args) {
        // for döngüsü başlığı başlatma, döngü devam koşulu ve artırma işlemi içerir
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("%d ", counter);
        }
        System.out.println();
    }
}
