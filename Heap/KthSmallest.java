import java.util.*;

public class KthSmallest {

    // GFG
    public static int kthSmallest(int[] arr, int k) {
        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.add(num);

            // Keep only k elements in the heap
            if (pq.size() > k) {
                pq.poll(); // Removes the largest element
            }
        }

        // Top of the heap is the kth smallest element
        return pq.peek();
    }

    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int ans = kthSmallest(arr, k);

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("k = " + k);
        System.out.println("Kth Smallest Element = " + ans);
    }
}