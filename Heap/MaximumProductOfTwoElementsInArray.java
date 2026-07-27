import java.util.*;

public class MaximumProductOfTwoElementsInArray {

    // Leetcode 1464
    public static int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            heap.add(num);
        }

        int ans = 1;
        for (int i = 1; i <= 2; i++) {
            ans *= (heap.poll() - 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};

        int result = maxProduct(nums);

        System.out.println("Maximum Product: " + result);
    }
}