import java.util.*;

public class MaximumProductOfThreeNumbers {

    // Leetcode 628
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3],
            nums[0] * nums[1] * nums[n - 1]
        );
    }

    public static void main(String[] args) {
        int[] nums = {-100, -98, -1, 2, 3, 4};

        int result = maximumProduct(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Maximum Product of Three Numbers: " + result);
    }
}