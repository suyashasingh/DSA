class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();

        for(char ch : t.toCharArray()){
            need.put(ch, need.getOrDefault(ch,0)+1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int formed = 0;
        int required = need.size();
        int start = 0;

        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0)+1);

            if(need.containsKey(ch) && need.get(ch).intValue() == window.get(ch).intValue()){
                formed++;
            }

            while(formed == required){

                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar)-1);

                if(need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)){
                    formed--;  
                }
                left++;

            }
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start, start+minLen);
        
    }
}