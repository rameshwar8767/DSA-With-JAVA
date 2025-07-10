import java.util.*;

public class triangle {
    public static void main(String[] args) {
        // triangle(4, 0);
        // System.out.println();
        // triangle2(4, 0);
        int[] arr = {2,3,1,6,4,5};
      System.out.println(Arrays.toString(bubbleSort(arr, arr.length - 1, 0)));
      System.out.println(Arrays.toString(selectionSort(arr, arr.length - 1, 0,0)));


    }
    static void triangle(int row,int col){
        if(row == 0) return;
        if(col < row) { 
            System.out.print("*");
            triangle(row, col+1);
        }else{
            System.out.println(); 
            triangle(row-1, 0);
        }
    }

    static void triangle2(int row,int col){
        if(row == 0) return;
        if(col < row) {
            triangle2(row, col+1);
            System.out.print("*");
            
        }else{
            triangle2(row-1, 0);
            System.out.println();
            
        }
    }
     int[] arr = {2,3,1,6,4,5};

    static int[] bubbleSort(int[] arr, int row, int col) {
        if (row == 0) return arr; // Base case: array is fully sorted

        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                // Swap if current element is greater than the next
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSort(arr, row, col + 1); // Recurse to next column
        } else {
            System.out.println(); // This line does nothing useful
            bubbleSort(arr, row - 1, 0); // Start next row of comparisons
        }

        return arr;
    }
    static int[] selectionSort(int[] arr, int row, int col, int max) {
        if (row == 0) return arr; // Base case

        if (col < row) {
            if (arr[col] > arr[max]) {
                return selectionSort(arr, row, col + 1, col); // pass new max index
            } else {
                return selectionSort(arr, row, col + 1, max); // keep current max
            }
        } else {
            // swap max element with the last element in current unsorted part
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;

            return selectionSort(arr, row - 1, 0, 0); // reduce row, restart col
        }
    }

}
