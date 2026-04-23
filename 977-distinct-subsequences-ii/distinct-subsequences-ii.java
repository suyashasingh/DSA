class Solution {
    public int distinctSubseqII(String s) {

        //we are using dp here because if we use recursion we got the duplicate and in dp we are eliminating the dp
        int mod = 1000000007;
        long total =1;
        long[] last = new long[26];

        for(char ch : s.toCharArray()){
            long newTotal = (2*total%mod - last[ch-'a']+mod)%mod;

            last[ch - 'a'] = total;
            total = newTotal;
        }

        return (int)(total-1+mod)%mod;
        
    }
}