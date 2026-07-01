import java.util.*;

public class NearlySorted {

    // GFG

    public static void nearlySorted(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;

        for (int ele : arr) {
            pq.add(ele);

            if (pq.size() > k + 1) {
                arr[index] = pq.remove();
                index++;
            }
        }

        while (!pq.isEmpty()) {
            arr[index] = pq.remove();
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        System.out.println("Original Nearly Sorted Array:");
        System.out.println(Arrays.toString(arr));

        nearlySorted(arr, k);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}