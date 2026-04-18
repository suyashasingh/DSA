class Solution {
    public String shortestPalindrome(String s) {

        //usimg brute force approach

        // int n = s.length();

        // for(int i = n ; i>=0 ; i--){
        //     if(isPalindrom(s, 0, i-1)){
        //         String remaining = s.substring(i);
        //         String rev = new StringBuilder(remaining).reverse().toString();
        //         return rev+s;
        //     }
        // }
        // return "";


        //optimized way

        String rev = new StringBuilder(s).reverse().toString();
        String str = s+"#"+rev;
        int[] lps = new int[str.length()];

        for(int  i =1 ; i<str.length() ; i++){
            int j = lps[i-1];

            while(j>0 && str.charAt(i)!=str.charAt(j)){
                j = lps[j-1];
            }
            if(str.charAt(i)==str.charAt(j)){
                j++;
            }

            lps[i] = j;
        }
        int len = lps[str.length()-1];
        return rev.substring(0, s.length()-len)+s; //TC-O(n), SC - O(1)
        
    }
    // public boolean isPalindrom(String s, int left, int right){
    //     while(left<right){
    //         if(s.charAt(left)!=s.charAt(right)) return false;
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
}