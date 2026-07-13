package medium;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3)
            return result;

        Arrays.sort(nums);

        if (nums[0] > 0 || nums[nums.length - 1] < 0)
            return result;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        System.out.println(solution.threeSum(
                new int[]{-1, 0, 1, 2, -1, -4}));
        // Expected: [[-1, -1, 2], [-1, 0, 1]]

        System.out.println(solution.threeSum(
                new int[]{0, 1, 1}));
        // Expected: []

        System.out.println(solution.threeSum(
                new int[]{0, 0, 0}));
        // Expected: [[0, 0, 0]]

        System.out.println(solution.threeSum(
                new int[]{0, 0, 0, 0}));
        // Expected: [[0, 0, 0]]

        System.out.println(solution.threeSum(
                new int[]{-2, 0, 1, 1, 2}));
        // Expected: [[-2, 0, 2], [-2, 1, 1]]

        System.out.println(solution.threeSum(
                new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2}));
        // Expected: [[-4, 2, 2], [-2, 0, 2]]

        System.out.println(solution.threeSum(
                new int[]{3, -2, 1, 0}));
        // Expected: []

        System.out.println(solution.threeSum(
                new int[]{-1, -1, -1, 2, 2}));
        // Expected: [[-1, -1, 2]]
    }
}
