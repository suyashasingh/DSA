class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int index, String s, List<String> curr, List<List<String>> result){
        if(index == s.length()){
            result.add(new ArrayList<>(curr));
        }

        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                curr.add(s.substring(index, i+1));
                backtrack(i+1, s, curr, result);
                curr.remove(curr.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}