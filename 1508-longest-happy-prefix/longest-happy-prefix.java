class Solution {
    public String longestPrefix(String s) {

        //brute force approach

        // int n = s.length();

        // for(int i = n-1; i>=0 ; i--){
        //     String prifix = s.substring(0, i);
        //     String suffix = s.substring(n-i); //substring(start) -->from start to end that why here is single character

        //     if(prifix.equals(suffix)){
        //       return prifix;
        //     }
        // }
        
        // return ""; TC - O(n*n)


        //Optimal solution using KMP

        int n = s.length();

        int[] lps =  new int[s.length()];

        for(int i = 1 ; i<n ;i++){
            int j = lps[i-1];

            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j = lps[j-1];
            }

            if(s.charAt(i) == s.charAt(j)){
                j++;
            }

            lps[i] = j;

        }

        int len = lps[n-1];

        return s.substring(0, len);

        //TC-O(n)
        //SC-O(1)
    }
}