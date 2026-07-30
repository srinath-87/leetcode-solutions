package medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    private List<String> result;

    private static final String[] MAP = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        solve(digits, 0, new StringBuilder());

        return result;
    }

    private void solve(String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = MAP[digit - '0'];

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            solve(digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber solution = new LetterCombinationsOfPhoneNumber();

        System.out.println(solution.letterCombinations("23"));
        // Expected: [ad, ae, af, bd, be, bf, cd, ce, cf]

        System.out.println(solution.letterCombinations(""));
        // Expected: []

        System.out.println(solution.letterCombinations("2"));
        // Expected: [a, b, c]

        System.out.println(solution.letterCombinations("7"));
        // Expected: [p, q, r, s]

        System.out.println(solution.letterCombinations("79"));
        // Expected:
        // [pw, px, py, pz,
        //  qw, qx, qy, qz,
        //  rw, rx, ry, rz,
        //  sw, sx, sy, sz]

        System.out.println(solution.letterCombinations("234"));
        // Expected:
        // [adg, adh, adi,
        //  aeg, aeh, aei,
        //  afg, afh, afi,
        //  bdg, bdh, bdi,
        //  beg, beh, bei,
        //  bfg, bfh, bfi,
        //  cdg, cdh, cdi,
        //  ceg, ceh, cei,
        //  cfg, cfh, cfi]

        System.out.println(solution.letterCombinations("9"));
        // Expected: [w, x, y, z]
    }
}
