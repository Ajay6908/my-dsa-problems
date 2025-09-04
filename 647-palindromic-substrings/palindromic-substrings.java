class Solution {
    public static int checkPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;  // found one palindrome
            left--;
            right++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // odd length palindromes
            count += checkPalindrome(s, i, i);

            // even length palindromes
            count += checkPalindrome(s, i, i + 1);
        }
        return count;
    }
}
