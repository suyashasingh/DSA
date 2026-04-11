class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        String sub = s+s;
        if(sub.contains(goal)) return true;
        return false;

        // TC - O(n) ->s+s
        // SC - O(n) ->space 2n 

        
    }
}