import java.util.*;

public class HouseRobberII {
    
    // Leetcode 213

    static int[] dp;

    public static int loot(int i, int end, int[] nums){
        if(i > end) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + loot(i+2, end, nums);
        int skip = loot(i+1, end, nums);
        int ans = Math.max(pick,skip);
        dp[i] = ans;
        return ans;
    }

    public static int solve(int i ,int end,int[] nums){
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return loot(i,end,nums);
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int case1 = solve(0,n-2,nums);
        int case2 = solve(1,n-1,nums);

        return Math.max(case1,case2);
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Maximum amount robbed: " + rob(nums1));

        int[] nums2 = {1, 2, 3, 1};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Maximum amount robbed: " + rob(nums2));

        int[] nums3 = {4, 1, 2, 7, 5, 3, 1};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.println("Maximum amount robbed: " + rob(nums3));
    }
}
