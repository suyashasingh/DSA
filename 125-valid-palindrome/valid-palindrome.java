class Solution {
    public boolean isPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1);
    }

    public boolean validPalindrome(String s, int left, int right) {

        // move left if not alphanumeric
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }

        // move right if not alphanumeric
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        // base case
        if (left >= right) {
            return true;
        }

        // case-insensitive comparison
        if (Character.toLowerCase(s.charAt(left)) !=
            Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        return validPalindrome(s, left + 1, right - 1);
    }
}
