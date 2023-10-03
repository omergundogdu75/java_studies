package ch5_methods;

/**
 * Scope sınıfı, alan (field) ve yerel değişken (local variable) kapsamını gösterir.
 */
public class Scope {
    private static int x = 1; // Sınıfın alanı (field) - Heryerden erişilebilir

    /**
     * Programın başladığı ana metod. Bu metod yerel bir x değişkeni oluşturur ve başlatır
     * ve useLocalVariable ve useField metodlarını çağırır.
     *
     * @param args Komut satırı argümanları (arguments)
     */
    public static void main(String[] args) {

        int x = 5; // Metodun yerel değişkeni x, sınıfın field x'ini gizler

        System.out.printf("main metodundaki yerel x: %d%n", x);

        useLocalVariable(); // useLocalVariable yerel x'e sahiptir
        useField(); // useField, Scope sınıfının field x'ini kullanır
        useLocalVariable(); // useLocalVariable yerel x'i yeniden başlatır
        useField(); // Scope sınıfının field x'i değerini korur
        mainAndField(x,Scope.x);

        System.out.printf("%nmain metodundaki yerel x: %d%n", x);
    }

    /**
     * Her çağrıda yerel değişken x'i oluşturur ve başlatır.
     * Her çağrıldığında başlatılır.
     */
    public static void useLocalVariable() {
        int x = 25; // useLocalVariable her çağrıldığında başlatılır

        System.out.printf(
                "%nuseLocalVariable metodundaki yerel x: %d%n", x);
        ++x; // Bu metodun yerel değişken x'ini değiştirir
        System.out.printf(
                "useLocalVariable metodundan çıkarkenki yerel x: %d%n", x);
    }

    /**
     * Her çağrıda Scope sınıfının field x'ini değiştirir.
     */
    public static void useField() {
        System.out.printf(
                "%nuseField metodundaki field x: %d%n", x);
        x *= 10; // Scope sınıfının field x'ini değiştirir
        System.out.printf(
                "useField metodundan çıkarkenki field x: %d%n", x);
    }

    public static void mainAndField(int mainX, int mainY){
        System.out.println(mainX + "----" + mainY);
    }
}
