package medium;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        int currentRow = 0;
        boolean goingDown = false;
        int rowslength = Math.min(numRows, s.length());
        for (int i = 0; i < rowslength; i++) {
            rows.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            rows.get(currentRow).append(s.charAt(i));
            if (currentRow == 0 || currentRow == rowslength - 1) {
                goingDown = !goingDown;
            }
            if (goingDown) {
                ++currentRow;
            } else {
                --currentRow;
            }
        }
        return rows.stream().map(StringBuilder::toString).reduce((a, b) -> a + b).orElse("");
    }

    public static void main(String[] args) {
        ZigzagConversion zc = new ZigzagConversion();

        System.out.println(zc.convert("PAYPALISHIRING", 3));
        // Expected: PAHNAPLSIIGYIR

        System.out.println(zc.convert("PAYPALISHIRING", 4));
        // Expected: PINALSIGYAHRPI

        System.out.println(zc.convert("A", 1));
        // Expected: A

        System.out.println(zc.convert("ABCDE", 3));
        // Expected: AEBDC

        System.out.println(zc.convert("ABCDEF", 2));
        // Expected: ACEBDF
    }
}
