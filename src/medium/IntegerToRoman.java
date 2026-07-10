package medium;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while(values[i] <= num){
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman solution = new IntegerToRoman();

        System.out.println(solution.intToRoman(1));
        // Expected: I

        System.out.println(solution.intToRoman(3));
        // Expected: III

        System.out.println(solution.intToRoman(4));
        // Expected: IV

        System.out.println(solution.intToRoman(9));
        // Expected: IX

        System.out.println(solution.intToRoman(58));
        // Expected: LVIII

        System.out.println(solution.intToRoman(1994));
        // Expected: MCMXCIV

        System.out.println(solution.intToRoman(3749));
        // Expected: MMMDCCXLIX

        System.out.println(solution.intToRoman(3999));
        // Expected: MMMCMXCIX

        System.out.println(solution.intToRoman(40));
        // Expected: XL

        System.out.println(solution.intToRoman(90));
        // Expected: XC

        System.out.println(solution.intToRoman(400));
        // Expected: CD

        System.out.println(solution.intToRoman(900));
        // Expected: CM
    }
}
