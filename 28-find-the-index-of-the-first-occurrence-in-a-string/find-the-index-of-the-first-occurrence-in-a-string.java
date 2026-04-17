class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);  //-->this is one liner solution but it use the buil in functions.


        // int n = haystack.length();
        // int m = needle.length();

        // for(int i = 0 ; i<= n-m; i++){
        //     int j = 0;
        //     while(j < m && haystack.charAt(i+j) == needle.charAt(j)){
        //        j++;
        //     }
        //    if(j == m){
        //     return i;
        //    }
        // }
        // return -1;
    }
}

//TC- O(n) SC-O(1)