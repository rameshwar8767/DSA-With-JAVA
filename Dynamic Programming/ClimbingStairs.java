import java.util.*;

public class ClimbingStairs {
    // Leetcode 70

    static int[] dp;

    public static int ways(int i, int n){
        if(i == n) return 1;
        if(i > n) return 0;
        if(dp[i] != -1) return dp[i];

        int ans = ways(i+1,n) + ways(i+2,n);
        dp[i] = ans;
        return ans;
    }

    public static int climbStairs(int n) {
        dp = new int[n+1];
        if(n == 1 || n == 2) return n;
        Arrays.fill(dp,-1);
        return ways(0,n);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways = " + climbStairs(n));
    }
}
