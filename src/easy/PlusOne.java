package easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();

        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 3})));
        // Expected: [1, 2, 4]

        System.out.println(Arrays.toString(solution.plusOne(new int[]{4, 3, 2, 1})));
        // Expected: [4, 3, 2, 2]

        System.out.println(Arrays.toString(solution.plusOne(new int[]{9})));
        // Expected: [1, 0]

        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 9})));
        // Expected: [1, 3, 0]

        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9})));
        // Expected: [1, 0, 0]

        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9, 9})));
        // Expected: [1, 0, 0, 0]

        System.out.println(Arrays.toString(solution.plusOne(new int[]{8, 9, 9})));
        // Expected: [9, 0, 0]

        System.out.println(Arrays.toString(solution.plusOne(new int[]{2, 9, 9, 9})));
        // Expected: [3, 0, 0, 0]
    }
}
