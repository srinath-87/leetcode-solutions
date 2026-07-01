package medium;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        int maxDiv10 = Integer.MAX_VALUE / 10;
        int minDiv10 = Integer.MIN_VALUE / 10;
        while (x != 0) {
            int r = x % 10;
            if (maxDiv10 < result || minDiv10 > result) {
                return 0;
            }
            if (maxDiv10 == result && r > 7)
                return 0;
            if (minDiv10 == result && r < -8)
                return 0;
            result = result * 10 + r;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();

        System.out.println(ri.reverse(123));
        // Expected: 321

        System.out.println(ri.reverse(-123));
        // Expected: -321

        System.out.println(ri.reverse(120));
        // Expected: 21

        System.out.println(ri.reverse(0));
        // Expected: 0

        System.out.println(ri.reverse(1534236469));
        // Expected: 0 (overflow)

        System.out.println(ri.reverse(-1534236469));
        // Expected: 0 (overflow)

        System.out.println(ri.reverse(1463847412));
        // Expected: 2147483641

        System.out.println(ri.reverse(-2147483412));
        // Expected: -2143847412
    }
}
