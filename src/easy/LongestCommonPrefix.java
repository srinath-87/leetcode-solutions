package easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix= strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        System.out.println(solution.longestCommonPrefix(
                new String[]{"flower", "flow", "flight"}));
        // Expected: fl

        System.out.println(solution.longestCommonPrefix(
                new String[]{"dog", "racecar", "car"}));
        // Expected: ""

        System.out.println(solution.longestCommonPrefix(
                new String[]{"interview", "internet", "internal"}));
        // Expected: inter

        System.out.println(solution.longestCommonPrefix(
                new String[]{"a"}));
        // Expected: a

        System.out.println(solution.longestCommonPrefix(
                new String[]{"", ""}));
        // Expected: ""

        System.out.println(solution.longestCommonPrefix(
                new String[]{"ab", "a"}));
        // Expected: a

        System.out.println(solution.longestCommonPrefix(
                new String[]{"abc", "abc", "abc"}));
        // Expected: abc

        System.out.println(solution.longestCommonPrefix(
                new String[]{"prefix", "pre", "prevent"}));
        // Expected: pre

        System.out.println(solution.longestCommonPrefix(
                new String[]{"aa", "aaa", "aaaa"}));
        // Expected: aa

        System.out.println(solution.longestCommonPrefix(
                new String[]{"x", "y", "z"}));
        // Expected: ""
    }
}
