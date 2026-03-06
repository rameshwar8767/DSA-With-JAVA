import java.util.*;

public class SelectionSort {

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,0,-1,4,-3,5,6,7};
        int n = arr.length;
        print(arr);
        System.out.println();

        for(int i = 0; i < n - 1; i++){   // n-1 passes

            int min = Integer.MAX_VALUE;
            int index = -1;

            for(int j = i; j < n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        print(arr);
    }
}