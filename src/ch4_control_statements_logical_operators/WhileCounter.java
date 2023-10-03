package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, bir kontrol değişkeni kullanarak 1 ile 10 arasındaki tamsayıları sıralı bir şekilde yazdırır.
 */
public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; // kontrol değişkenini tanımla ve başlat.
        while (counter <= 10) {
            System.out.printf("%d ", counter);
            ++counter;
        }
    }
}
