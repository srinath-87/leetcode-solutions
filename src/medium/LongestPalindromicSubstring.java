package medium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }
        int maxLength = 1;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddLength = expand(s, i, i);
            int evenLength = expand(s, i, i + 1);
            int len = Math.max(oddLength, evenLength);
            if (len > maxLength) {
                start = i - ((len - 1) / 2);
                maxLength = len;
            }
        }
        return s.substring(start, start+maxLength);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        System.out.println(lps.longestPalindrome("babad"));
        System.out.println(lps.longestPalindrome("cbbd"));
        System.out.println(lps.longestPalindrome("racecar"));
    }
}
