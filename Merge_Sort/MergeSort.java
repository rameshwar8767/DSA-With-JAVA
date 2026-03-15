import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,8,1,7,6};
        mergeSort(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    private static void mergeSort(int[] arr){
        if(arr.length <= 1) return;
        // step 1 : Create 2 new empty arrays of size n/2 each
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];

        //Step 2 : Copy paste arr into a and b
        int idx = 0; // idx travel on big array

        for(int i = 0; i < a.length; i++){
            a[i] = arr[idx];
            idx++;
        }

        for(int i = 0; i < b.length; i++){
            b[i] = arr[idx];
            idx++;
        }

        //Step 3 : Apply Magic on a and b
        mergeSort(a);
        mergeSort(b);

        //Step 4 : Merge 'a'and 'b' into arr
        merge(a,b,arr);

    }

    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }
}
