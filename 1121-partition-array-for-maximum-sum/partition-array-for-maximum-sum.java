class Solution {
    int[] dp;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return solve(0, arr, k);
    }

    public int solve(int i, int[] arr, int k){
        if(i == arr.length) return 0;
        if(dp[i] != -1){
            return dp[i];
        }

        int maxValue = 0;
        int ans = 0;

        for(int j = i; j<Math.min(arr.length, i+k); j++){
            maxValue = Math.max(maxValue, arr[j]);

            int len = j-i+1;
            int sum = maxValue*len + solve(j+1, arr, k);
            ans = Math.max(ans, sum);
        }
        return dp[i] = ans;

    }
}

// Time: O(n × k)
// Space: O(n)