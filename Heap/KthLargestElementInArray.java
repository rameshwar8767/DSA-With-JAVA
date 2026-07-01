import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

    // Leetcode 215

    public static int findKthLargest(int[] nums, int k) {

        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);

            // Keep only k largest elements
            if (pq.size() > k) {
                pq.remove();
            }
        }

        // Top of heap = kth largest
        return pq.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int ans = findKthLargest(nums, k);

        System.out.println("Array : " + Arrays.toString(nums));
        System.out.println("k = " + k);
        System.out.println("Kth Largest Element = " + ans);
    }
}