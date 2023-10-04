package ch6_Arrays_and_ArrayLists;

import java.util.Arrays;

/**
 * {@code ArrayManipulations} sınıfı, Java'nın Arrays sınıfının bazı yöntemlerini ve System.arraycopy yöntemini
 * kullanarak çeşitli dizi işlemlerini gösterir.
 */
public class ArrayManipulations {
    public static void main(String[] args) {
        // doubleArray'ı artan sırayla sırala
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");

        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }

        // 10 elemanlı diziyi 7 ile doldur
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        // intArray'ı intArrayCopy'a kopyala
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // intArray ve intArrayCopy'ı eşitlik açısından karşılaştır
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",
                (b ? "==" : "!="));

        // intArray ve filledIntArray'yı eşitlik açısından karşılaştır
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n",
                (b ? "==" : "!="));

        // intArray'da 5 değerini ara
        int location = Arrays.binarySearch(intArray, 5);
        if (location >= 0) {
            System.out.printf(
                    "Found 5 at element %d in intArray%n", location);
        } else {
            System.out.println("5 not found in intArray");
        }

        // intArray'da 8763 değerini ara
        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0) {
            System.out.printf(
                    "Found 8763 at element %d in intArray%n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }
    }

    // Her bir dizideki değerleri görüntüle
    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
}
