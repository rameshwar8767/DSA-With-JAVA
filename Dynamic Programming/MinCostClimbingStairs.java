import java.util.*;

public class MinCostClimbingStairs {
    // Leetcode 746

    static int[] dp;

    public static int minCost(int i, int[] cost) {
        if (i >= cost.length) return 0;

        if (dp[i] != -1) return dp[i];

        int ans = cost[i] + Math.min(
                minCost(i + 1, cost),
                minCost(i + 2, cost)
        );

        return dp[i] = ans;
    }

    public static int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(minCost(0, cost), minCost(1, cost));
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};

        System.out.println("Minimum Cost = " + minCostClimbingStairs(cost));
    }
}