class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Boolean[] bool = new Boolean[s.length()];

        return dfs(0, s, set, bool);
    }

    public boolean dfs(int index, String s, Set<String> set, Boolean[] bool){

        if(index == s.length()){
            return true;
        }

        if(bool[index] != null){
            return bool[index];
        }


        for(int end = index+1; end <= s.length(); end++){
            String part = s.substring(index, end);

            if(set.contains(part) && dfs(end, s, set, bool)){
                bool[index] = true;
                return true;
            }
        }

        bool[index] = false;
        return false;
    }
}

//TC-O(n³)
//SC-O(n)