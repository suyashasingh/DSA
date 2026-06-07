class Solution {
    Integer[][] dp;
    public int minInsertions(String s) {
        int n = s.length();
        dp = new Integer[s.length()][s.length()] ;
        int lps = dfs(0, s.length()-1, s);
        return n - lps;
    }

    public int dfs(int i, int j, String s){
        if (i > j) return 0;

        if (i == j) return 1;

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] =
                2 + dfs(i + 1, j - 1, s);
        }

        return dp[i][j] =
            Math.max(
                dfs(i + 1, j, s),
                dfs(i, j - 1, s)
            );
    }
}