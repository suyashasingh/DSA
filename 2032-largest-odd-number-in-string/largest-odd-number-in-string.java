class Solution {
    public String largestOddNumber(String num) {
       //Brute force approach
        //    String odd = "";

        //     for(int i = 0; i<num.length(); i++){
        //         for(int j = i+1; j<=num.length(); j++){
        //             String sub = num.substring(i,j);
        //             //Check odd
        //             char last = sub.charAt(sub.length()-1);
        //             if((last - '0')%2==1){
        //                 if((sub.length() > odd.length()) || (sub.length()==odd.length() && sub.compareTo(odd)>0))
        //                 odd = sub;
        //             }

        //         }
        //     }
        //     return odd;


        int n = num.length();

        //optimize solution

        for(int i = n-1; i>=0; i--){
            char last = num.charAt(i);

            if((last-'0')%2==1){
                return num.substring(0, i+1);
            }

        }
        return "";

    }
}