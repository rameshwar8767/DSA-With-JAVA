import java.util.*;

public class HouseRobber {
    // Leetcode 198
    static int[] dp;

    public int loot(int i, int[] nums) {
        if (i >= nums.length) return 0;

        if (dp[i] != -1) return dp[i];

        int pick = nums[i] + loot(i + 2, nums);
        int skip = loot(i + 1, nums);

        return dp[i] = Math.max(pick, skip);
    }

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return loot(0, nums);
    }

    public static void main(String[] args) {
        HouseRobber obj = new HouseRobber();

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println("Maximum amount robbed = " + obj.rob(nums));
    }
}