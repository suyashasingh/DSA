class Solution {
    Integer[][] dp;
    public int numDistinct(String s, String t) {
        dp = new Integer[s.length()][t.length()];
        return dfs(0, 0, s, t);
    }

    public int dfs(int i, int j, String s, String t){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;

        if(dp[i][j] != null){
            return dp[i][j];
        }

        if(s.charAt(i) == t.charAt(j)){
            int take = dfs(i+1, j+1, s, t);
            int notTake = dfs(i+1, j, s, t);

            dp[i][j] = take+notTake;
            return dp[i][j];
        }

        dp[i][j] = dfs(i+1, j, s, t);
        return dp[i][j];
    }
}