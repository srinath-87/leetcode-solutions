package medium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

	private final LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();

	@Test
	void example_abcabcbb() {
		assertEquals(3, solver.lengthOfLongestSubstring("abcabcbb"));
	}

	@Test
	void example_bbbbb() {
		assertEquals(1, solver.lengthOfLongestSubstring("bbbbb"));
	}

	@Test
	void example_pwwkew() {
		assertEquals(3, solver.lengthOfLongestSubstring("pwwkew"));
	}

	@Test
	void emptyString() {
		assertEquals(0, solver.lengthOfLongestSubstring(""));
	}

	@Test
	void allUnique() {
		assertEquals(6, solver.lengthOfLongestSubstring("abcdef"));
	}

	@Test
	void repeatingAtEnd() {
		// longest substring is "dvdf" → length 4
		assertEquals(3, solver.lengthOfLongestSubstring("dvdf"));
	}

	@Test
	void longestUniqueSequenceAtEnd() {
		 // Contains 15 unique characters: "abcdefghijklmno"
	    assertEquals(15, solver.lengthOfLongestSubstring("aaabcbcdeffabcdefghijklmno"));
	}

}
