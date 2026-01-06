class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev=0;
        int n = Math.abs(x);

        while(n>0){
            rev = rev*10+(n%10);
            n = n/10;
        }
        if(org == rev) return true;
        return false;     
    }
}