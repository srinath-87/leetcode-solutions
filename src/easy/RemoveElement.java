package easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int k1 = solution.removeElement(nums1, 3);
        System.out.println("k = " + k1);
        System.out.println(Arrays.toString(Arrays.copyOf(nums1, k1)));
        // Expected: [2, 2]

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = solution.removeElement(nums2, 2);
        System.out.println("k = " + k2);
        System.out.println(Arrays.toString(Arrays.copyOf(nums2, k2)));
        // Expected: [0, 1, 3, 0, 4] (order may vary)

        int[] nums3 = {1};
        int k3 = solution.removeElement(nums3, 1);
        System.out.println("k = " + k3);
        System.out.println(Arrays.toString(Arrays.copyOf(nums3, k3)));
        // Expected: []

        int[] nums4 = {1};
        int k4 = solution.removeElement(nums4, 2);
        System.out.println("k = " + k4);
        System.out.println(Arrays.toString(Arrays.copyOf(nums4, k4)));
        // Expected: [1]

        int[] nums5 = {2, 2, 2, 2};
        int k5 = solution.removeElement(nums5, 2);
        System.out.println("k = " + k5);
        System.out.println(Arrays.toString(Arrays.copyOf(nums5, k5)));
        // Expected: []

        int[] nums6 = {1, 2, 3, 4, 5};
        int k6 = solution.removeElement(nums6, 6);
        System.out.println("k = " + k6);
        System.out.println(Arrays.toString(Arrays.copyOf(nums6, k6)));
        // Expected: [1, 2, 3, 4, 5]
    }
}
