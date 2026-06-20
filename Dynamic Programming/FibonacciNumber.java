import java.util.*;

public class FibonacciNumber {

    // Leetcode 509
    static int[] dp;

    public int helper(int n) {
        if (n == 0 || n == 1) return n;

        if (dp[n] != 0) return dp[n];

        int ans = helper(n - 1) + helper(n - 2);
        dp[n] = ans;

        return ans;
    }

    public int fib(int n) {
        dp = new int[n + 1];
        return helper(n);
    }

    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();

        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + obj.fib(n));
    }
}