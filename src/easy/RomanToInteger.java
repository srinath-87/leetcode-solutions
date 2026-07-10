package easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));
            int next = i + 1 < s.length() ? value(s.charAt(i + 1)) : 0;
            if (current <next){
                result-= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    private int value(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();

        System.out.println(solution.romanToInt("III"));
        // Expected: 3

        System.out.println(solution.romanToInt("IV"));
        // Expected: 4

        System.out.println(solution.romanToInt("IX"));
        // Expected: 9

        System.out.println(solution.romanToInt("LVIII"));
        // Expected: 58

        System.out.println(solution.romanToInt("MCMXCIV"));
        // Expected: 1994

        System.out.println(solution.romanToInt("XL"));
        // Expected: 40

        System.out.println(solution.romanToInt("XC"));
        // Expected: 90

        System.out.println(solution.romanToInt("CD"));
        // Expected: 400

        System.out.println(solution.romanToInt("CM"));
        // Expected: 900

        System.out.println(solution.romanToInt("MMMCMXCIX"));
        // Expected: 3999

        System.out.println(solution.romanToInt("XXVII"));
        // Expected: 27

        System.out.println(solution.romanToInt("XII"));
        // Expected: 12
    }
}
