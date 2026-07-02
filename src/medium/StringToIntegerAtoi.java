package medium;

public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        int result = 0;
        int index = 0;
        int sign = 1;
        int maxDiv10 = Integer.MAX_VALUE / 10;
        while (index < s.length() && s.charAt(index) == ' ') {
            ++index;
        }
        if (index == s.length()) return 0;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            if (s.charAt(index) == '-') sign *= -1;
            ++index;
        }
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                if (maxDiv10 < result) {
                    return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                if (maxDiv10 == result) {
                    if (sign < 0 && digit >= 8) return Integer.MIN_VALUE;
                    if (digit > 7) return Integer.MAX_VALUE;
                }
                result = result * 10 + digit;
                ++index;
            } else {
                return result * sign;
            }
        }
        return result * sign;
    }

    public static void main(String[] args) {
        StringToIntegerAtoi atoi = new StringToIntegerAtoi();

        System.out.println(atoi.myAtoi("42"));
        // Expected: 42

        System.out.println(atoi.myAtoi("   -42"));
        // Expected: -42

        System.out.println(atoi.myAtoi("4193 with words"));
        // Expected: 4193

        System.out.println(atoi.myAtoi("words and 987"));
        // Expected: 0

        System.out.println(atoi.myAtoi("-91283472332"));
        // Expected: -2147483648

        System.out.println(atoi.myAtoi("91283472332"));
        // Expected: 2147483647

        System.out.println(atoi.myAtoi("+1"));
        // Expected: 1

        System.out.println(atoi.myAtoi("+-12"));
        // Expected: 0

        System.out.println(atoi.myAtoi("000123"));
        // Expected: 123

        System.out.println(atoi.myAtoi("00000"));
        // Expected: 0

        System.out.println(atoi.myAtoi("0-1"));
        // Expected: 0

        System.out.println(atoi.myAtoi("   +042 5"));
        // Expected: 42

        System.out.println(atoi.myAtoi(""));
        // Expected: 0

        System.out.println(atoi.myAtoi("   "));
        // Expected: 0

        System.out.println(atoi.myAtoi(".123"));
        // Expected: 0

        System.out.println(atoi.myAtoi("2147483647"));
        // Expected: 2147483647

        System.out.println(atoi.myAtoi("2147483648"));
        // Expected: 2147483647

        System.out.println(atoi.myAtoi("-2147483648"));
        // Expected: -2147483648

        System.out.println(atoi.myAtoi("-2147483649"));
        // Expected: -2147483648
    }
}
