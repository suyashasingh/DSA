class Solution {
    public String removeOuterParentheses(String s) {
        char[] arr = s.toCharArray();
        int count = 0, idx = 0;

        for (char ch : arr) {
            if (ch == '(' && count++ > 0) arr[idx++] = ch;
            if (ch == ')' && --count > 0) arr[idx++] = ch;
        }

        return new String(arr, 0, idx);
    }
}