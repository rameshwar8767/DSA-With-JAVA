import java.util.*;

public class SticklerThief {
    // GFG
    static int[] dp;

    public static int loot(int i, int[] arr) {
        if (i >= arr.length) return 0;

        if (dp[i] != -1) return dp[i];

        int pick = arr[i] + loot(i + 2, arr);
        int skip = loot(i + 1, arr);

        return dp[i] = Math.max(pick, skip);
    }

    public static int findMaxSum(int arr[]) {
        dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return loot(0, arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 100, 10, 5};
        System.out.println(findMaxSum(arr));
    }
}