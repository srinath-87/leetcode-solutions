package easy;

public class SqrtX {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == x / mid && x % mid == 0) return mid;
            if (mid > x / mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        SqrtX solution = new SqrtX();

        System.out.println(solution.mySqrt(0));
        // Expected: 0

        System.out.println(solution.mySqrt(1));
        // Expected: 1

        System.out.println(solution.mySqrt(4));
        // Expected: 2

        System.out.println(solution.mySqrt(8));
        // Expected: 2

        System.out.println(solution.mySqrt(9));
        // Expected: 3

        System.out.println(solution.mySqrt(15));
        // Expected: 3

        System.out.println(solution.mySqrt(16));
        // Expected: 4

        System.out.println(solution.mySqrt(25));
        // Expected: 5

        System.out.println(solution.mySqrt(30));
        // Expected: 5

        System.out.println(solution.mySqrt(2147395599));
        // Expected: 46339

        System.out.println(solution.mySqrt(Integer.MAX_VALUE));
        // Expected: 46340
    }
}
