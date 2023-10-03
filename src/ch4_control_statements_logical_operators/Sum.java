package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, for döngüsünü kullanarak 2 ile 20 arasındaki çift tamsayıları toplar.
 */
public class Sum {
    public static void main(String[] args) {
        int total = 0;
        // 2 ile 20 arasındaki çift tamsayıları topla
        for (int number = 2; number <= 20; number += 2) {
            total += number;
        }
        System.out.printf("Toplam %d%n", total);
    }
}
