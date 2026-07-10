package medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        // Expected: 49

        System.out.println(solution.maxArea(new int[]{1, 1}));
        // Expected: 1

        System.out.println(solution.maxArea(new int[]{4, 3, 2, 1, 4}));
        // Expected: 16

        System.out.println(solution.maxArea(new int[]{1, 2, 1}));
        // Expected: 2

        System.out.println(solution.maxArea(new int[]{2, 3, 4, 5, 18, 17, 6}));
        // Expected: 17

        System.out.println(solution.maxArea(new int[]{1, 2, 4, 3}));
        // Expected: 4

        System.out.println(solution.maxArea(new int[]{2, 2, 2, 2}));
        // Expected: 6

        System.out.println(solution.maxArea(new int[]{5, 4, 3, 2, 1}));
        // Expected: 6

        System.out.println(solution.maxArea(new int[]{1, 2, 3, 4, 5}));
        // Expected: 6
    }
}
