package ch3_control_statements;

/**
 * Bu Java programı, ön ek artırma ve son ek artırma operatörlerini gösterir.
 */
public class Increment {
    public static void main(String[] args) {
        // Son ek artırma operatörünü göster
        int c = 5;
        System.out.printf("Son ek artırma öncesi c: %d%n", c);
        System.out.printf("     Son ek artırma: %d%n", c++);
        System.out.printf(" Son ek artırma sonrası c: %d%n", c);
        System.out.println();

        // Ön ek artırma operatörünü göster
        System.out.printf("Ön ek artırma öncesi c: %d%n", c);
        System.out.printf("     Ön ek artırma: %d%n", ++c);
        System.out.printf(" Ön ek artırma sonrası c: %d%n", c);
    }
}
