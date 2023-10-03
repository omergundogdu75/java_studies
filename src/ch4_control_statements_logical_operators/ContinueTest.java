package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, bir for döngüsünün içinde bir iterasyonu sonlandırmak için continue ifadesini kullanır.
 */
public class ContinueTest {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) { // 10 kez döner
            if (count == 5) continue; // count 5 olduğunda döngü gövdesindeki kalan kodu atlar
            System.out.printf("%d ", count);
        }
    }
}
