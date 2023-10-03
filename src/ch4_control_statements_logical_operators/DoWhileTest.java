package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, do-while döngüsünü kullanarak bir işlemi en az bir kez gerçekleştirir.
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.printf("%d ", counter);
            ++counter;
        } while (counter <= 10);
        System.out.println();
    }
}
