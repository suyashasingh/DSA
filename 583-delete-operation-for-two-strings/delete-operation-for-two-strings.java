class Solution {
    Integer[][] dp;
    public int minDistance(String word1, String word2) {
        
        dp = new Integer[word1.length()][word2.length()] ;
        int lcs = dfs(0, 0, word1, word2);

        return word1.length()+word2.length()-(2*lcs);
    }

    public int dfs(int i, int j, String word1 , String word2){
        if(i == word1.length() || j == word2.length()) return 0;

        if (dp[i][j] != null) return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] =
                1 + dfs(i + 1, j + 1, word1, word2);
        }

        return dp[i][j] =
            Math.max(
                dfs(i + 1, j, word1, word2),
                dfs(i, j+1, word1, word2)
            );
    }
}