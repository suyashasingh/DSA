class Solution {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        return solve(n, dp);
    }

    public int solve(int n, int[] dp) {
        if (n <= 1) return n;

        if (dp[n] != 0) return dp[n]; // already calculated

        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        return dp[n];
    }
}