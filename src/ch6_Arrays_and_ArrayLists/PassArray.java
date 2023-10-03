package ch6_Arrays_and_ArrayLists;

// Passing arrays and individual array elements to methods.

public class PassArray {
    // main creates array and calls modifyArray and modifyElement
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.printf(
                "Effects of passing reference to entire array:%n" +
                        "The values of the original array are:%n");

        // output original array elements
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        modifyArray(array); // pass array reference
        System.out.printf("%n%nThe values of the modified array are:%n");

        // output modified array elements
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        System.out.printf(
                "%n%nEffects of passing array element value:%n" +
                        "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]); // attempt to modify array[3]
        System.out.printf(
                "array[3] after modifyElement: %d%n", array[3]);
    }

    // multiply each element of an array by 2
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    // multiply argument by 2
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf(
                "Value of element in modifyElement: %d%n", element);
    }
}
// Pass-By-Value vs. Pass-By-Reference
//Bir argüman değere göre iletildiğinde, argümanın değerinin bir kopyası çağrılan yönteme iletilir. Çağrılan yöntem
// yalnızca kopyayla çalışır. Çağrılan yöntemin kopyasında yapılan değişiklikler, arayandaki orijinal değişkenin
// değerini etkilemez. Bir argüman referans olarak iletildiğinde, çağrılan yöntem çağırandaki argümanın değerine
// doğrudan erişebilir ve gerekirse bu verileri değiştirebilir. Referansa göre geçiş, muhtemelen büyük miktarlarda
// veriyi kopyalama ihtiyacını ortadan kaldırarak performansı artırır.

//Diğer bazı dillerden farklı olarak Java, değere göre geçiş veya referansa göre geçiş seçmenize izin vermez; tüm argümanlar değere göre iletilir.
