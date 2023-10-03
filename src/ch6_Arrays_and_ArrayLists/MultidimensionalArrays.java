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
    }
}
