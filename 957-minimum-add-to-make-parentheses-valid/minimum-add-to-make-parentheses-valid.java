class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int move = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
            }
            else{
                if(open > 0){
                    open--;
                }
                else{
                    move++;
                }
            }
        }

        return open+move;
        
    }
}

// TC-O(n) SC-O(1)