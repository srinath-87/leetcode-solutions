package medium;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return sum;
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum < target) left++;
                else right--;
            }
        }
        return closestSum;
    }


    public static void main(String[] args) {
        ThreeSumClosest solution = new ThreeSumClosest();

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println(solution.threeSumClosest(nums1, target1));
        // Expected: 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println(solution.threeSumClosest(nums2, target2));
        // Expected: 0

        int[] nums3 = {1, 1, 1, 0};
        int target3 = -100;
        System.out.println(solution.threeSumClosest(nums3, target3));
        // Expected: 2

        int[] nums4 = {-100, -98, -2, -1};
        int target4 = -101;
        System.out.println(solution.threeSumClosest(nums4, target4));
        // Expected: -101

        int[] nums5 = {-1, 0, 1, 1, 55};
        int target5 = 3;
        System.out.println(solution.threeSumClosest(nums5, target5));
        // Expected: 2
    }
}
