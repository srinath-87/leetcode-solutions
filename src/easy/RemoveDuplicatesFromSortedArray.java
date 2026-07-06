package easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.print("k = " + k1 + " -> ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        // Expected: k = 2 -> 1 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.print("k = " + k2 + " -> ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        // Expected: k = 5 -> 0 1 2 3 4

        int[] nums3 = {1};
        int k3 = solution.removeDuplicates(nums3);
        System.out.print("k = " + k3 + " -> ");
        for (int i = 0; i < k3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println();
        // Expected: k = 1 -> 1

        int[] nums4 = {1, 1, 1, 1};
        int k4 = solution.removeDuplicates(nums4);
        System.out.print("k = " + k4 + " -> ");
        for (int i = 0; i < k4; i++) {
            System.out.print(nums4[i] + " ");
        }
        System.out.println();
        // Expected: k = 1 -> 1

        int[] nums5 = {1, 2, 3, 4, 5};
        int k5 = solution.removeDuplicates(nums5);
        System.out.print("k = " + k5 + " -> ");
        for (int i = 0; i < k5; i++) {
            System.out.print(nums5[i] + " ");
        }
        System.out.println();
        // Expected: k = 5 -> 1 2 3 4 5

        int[] nums6 = {-3, -3, -2, -1, -1, 0, 1, 1};
        int k6 = solution.removeDuplicates(nums6);
        System.out.print("k = " + k6 + " -> ");
        for (int i = 0; i < k6; i++) {
            System.out.print(nums6[i] + " ");
        }
        System.out.println();
        // Expected: k = 5 -> -3 -2 -1 0 1
    }
}
