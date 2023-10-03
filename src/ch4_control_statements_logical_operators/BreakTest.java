package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, bir for döngüsünün içinden çıkmak için break ifadesini kullanır.
 */
public class BreakTest {
    public static void main(String[] args) {
        int count; // Kontrol değişkeni, döngü sona erdikten sonra da kullanılır
        for (count = 0; count <= 10; count++) { // 10 kez döner
            if (count == 5) break; // count 5 olduğunda döngüyü sonlandırır
            System.out.printf("%d ", count);
        }
        System.out.printf("%nDöngüyü count = %d değerinde sonlandırdı%n", count);
    }
}
