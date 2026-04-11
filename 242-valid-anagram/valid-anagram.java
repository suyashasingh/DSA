class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // char[] s1 = s.toLowerCase().toCharArray();
        // char[] s2 = t.toLowerCase().toCharArray();

        // Arrays.sort(s1);
        // Arrays.sort(s2);
        // return Arrays.equals(s1, s2);

        // Time Complexity: O(n log n) (due to sorting)
        // Space Complexity: O(n) (for character arrays)
        



        //more optimize approach

        int[] freq = new int[26];

        for(int i = 0; i< s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i)- 'a']--; 
        }

        for(int count : freq){
            if(count != 0) return false;
        }

        return true;

        //TC - O(n)
        //SC - O(1) ----> 26 char constant


    }
}