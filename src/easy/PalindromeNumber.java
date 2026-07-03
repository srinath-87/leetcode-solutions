package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;
        int reversed = 0;
        while (x > reversed) {
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        return x == reversed || x == (reversed / 10);
    }

    public static void main(String[] args) {

        PalindromeNumber solution = new PalindromeNumber();

        System.out.println(solution.isPalindrome(121));
        // Expected: true

        System.out.println(solution.isPalindrome(-121));
        // Expected: false

        System.out.println(solution.isPalindrome(10));
        // Expected: false

        System.out.println(solution.isPalindrome(0));
        // Expected: true

        System.out.println(solution.isPalindrome(1221));
        // Expected: true

        System.out.println(solution.isPalindrome(12321));
        // Expected: true

        System.out.println(solution.isPalindrome(123321));
        // Expected: true

        System.out.println(solution.isPalindrome(123421));
        // Expected: false

        System.out.println(solution.isPalindrome(1001));
        // Expected: true

        System.out.println(solution.isPalindrome(100));
        // Expected: false

        System.out.println(solution.isPalindrome(11));
        // Expected: true

        System.out.println(solution.isPalindrome(12));
        // Expected: false

        System.out.println(solution.isPalindrome(2147447412));
        // Expected: true

        System.out.println(solution.isPalindrome(2147483647));
        // Expected: false
    }
}
