package easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();

        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
        // Expected: 2

        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
        // Expected: 1

        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
        // Expected: 4

        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
        // Expected: 0

        System.out.println(solution.searchInsert(new int[]{1}, 1));
        // Expected: 0

        System.out.println(solution.searchInsert(new int[]{1}, 0));
        // Expected: 0

        System.out.println(solution.searchInsert(new int[]{1}, 2));
        // Expected: 1

        System.out.println(solution.searchInsert(new int[]{1, 3}, 2));
        // Expected: 1

        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 4));
        // Expected: 2

        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 6));
        // Expected: 3
    }
}
