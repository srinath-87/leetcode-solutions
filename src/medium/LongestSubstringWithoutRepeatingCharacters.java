package medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		int maxlen = 0;
		Set<Character> subString = new HashSet<Character>();
		for (int right = 0, left = 0; right < s.length(); right++) {
			while (subString.contains(s.charAt(right))) {
				subString.remove(s.charAt(left++));
			}
			subString.add(s.charAt(right));
			maxlen = Math.max(maxlen, right - left + 1);
		}
		return maxlen;
	}
}
