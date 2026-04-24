class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        boolean[] dp = new boolean[k+1];
        dp[0] = true;
        
        for(int num : arr){
           for(int target = k; target>=num; target--){
               dp[target] = dp[target] || dp[target-num];
           }
        }
        return dp[k];
    }
}