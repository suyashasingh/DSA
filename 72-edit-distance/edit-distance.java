class Solution {
    Integer[][] dp;
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new Integer[n][m];

        return dfs(0, 0, word1, word2);  
    }

    public int dfs(int i, int j, String word1, String word2){
        if(i == word1.length()){
            return word2.length()-j;
        }
        if(j == word2.length()){
            return word1.length()-i;
        }

        if(dp[i][j] != null){
            return dp[i][j];
        }
        if(word1.charAt(i) == word2.charAt(j)){
            dp[i][j] = dfs(i+1, j+1, word1, word2);
            return dp[i][j];
        }

        int replace = dfs(i+1, j+1, word1, word2);
        int delete = dfs(i+1, j, word1, word2);
        int insert = dfs(i, j+1, word1, word2);

        dp[i][j] = 1 + Math.min(replace, Math.min(delete, insert));
        return dp[i][j];
    }
}