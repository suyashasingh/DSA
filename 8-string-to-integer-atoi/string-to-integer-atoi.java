class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

       while(i<n && s.charAt(i)==' '){
        i++;
       }

       // maintain sign here

       int sign = 1;

       if(i<n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
        sign = (s.charAt(i)== '-') ? -1 : 1;
        i++;

       }

       int num = 0;

       // check if the char is digit or not

       while(i<n && Character.isDigit(s.charAt(i))){
        int digit = s.charAt(i) - '0';

        //handle overflow case

        if(num>(Integer.MAX_VALUE-digit)/10){
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        num = num*10+digit;
        i++;
       }

       return num*sign;
        
    }

    //TC - O(n)
    //SC - O(1)
    //this is the brute force and this is optimal only
}