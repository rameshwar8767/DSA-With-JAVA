import java.util.*;

public class ShallowAndDeepCopy {

    public static void main(String[] args) {

        // Original 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        /*
         * DEEP COPY of 2D array
         * ---------------------
         * In Java, a 2D array is an array of arrays.
         * So, to create a true deep copy:
         * 1. Create a new outer array
         * 2. Clone each inner array (row)
         */

        int[][] copiedMatrix = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            // Clone each row to ensure independent memory allocation
            copiedMatrix[i] = matrix[i].clone();
        }

        // Modify the copied array
        copiedMatrix[1][3] = 20;

        /*
         * Output check:
         * Original matrix should remain unchanged
         * because we performed a deep copy
         */
        System.out.println("Original matrix value: " + matrix[1][3]);   // Expected: 8
        System.out.println("Copied matrix value: " + copiedMatrix[1][3]); // Expected: 20
    }
}