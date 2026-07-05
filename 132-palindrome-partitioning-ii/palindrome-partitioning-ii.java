class Solution {
    int[] dp;
    public int minCut(String s) {
        int n = s.length();
        dp = new int[n];

        Arrays.fill(dp, -1);

        return solve(0, s)-1; 
    }

    public int solve(int index, String s){
        if(index == s.length()) return 0;

        if(dp[index] != -1){
            return dp[index];
        }

        int ans = Integer.MAX_VALUE;
        for(int i = index ; i<s.length() ; i++){
            if(isPalindrome(s, index, i)){
                ans = Math.min(ans, 1 + solve(i+1, s));
            }
        }

        return dp[index] = ans;
    }

    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}