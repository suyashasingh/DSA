class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;

        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backtrack(0, digits, map, new StringBuilder(), result);
        return result;
    }

    public void backtrack(int index, String digits, String[] map, StringBuilder curr, List<String> result){

        if(index == digits.length()){
            result.add(curr.toString());
            return;
        }

        String letter = map[digits.charAt(index) - '0'];

        for(char ch : letter.toCharArray()){
            curr.append(ch);
            backtrack(index+1, digits, map, curr, result);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}

//Tc-O(n × 4^n)
//sc-O(n × 4^n) including auxilary space , with it it will be O(n)