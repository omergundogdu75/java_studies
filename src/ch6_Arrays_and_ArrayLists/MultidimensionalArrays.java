package ch6_Arrays_and_ArrayLists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] b = {{1, 2}, {3, 4}}; // Arrays of One-Dimensional Arrays
        int[][] c = {{1, 2}, {3, 4, 5}}; //Two-Dimensional Arrays with Rows of Different Lengths
        int[][] d = new int[3][4];
        int[][] e = new int[2][]; // create 2 rows
        e[0] = new int[5]; // create 5 columns for row 0
        e[1] = new int[3]; // create 3 columns for row 1

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println("Values in array1 by row are");
        outputArray(array1); // displays array1 by row
        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2); // displays array2 by row

    }

    // output rows and columns of a two-dimensional array
    public static void outputArray(int[][] array) {
        // loop through array's rows
        for (int row = 0; row < array.length; row++) {
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            }

            System.out.println();
        }
    }
}
/*
*
* int total = 0;
for (int row = 0; row < a.length; row++) {
 for (int column = 0; column < a[row].length; column++) {
 total += a[row][column];
 }
}
* */