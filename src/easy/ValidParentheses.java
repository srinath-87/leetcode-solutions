package easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (char current : s.toCharArray()) {
            if (current == '[' || current == '(' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((current == ']' && top != '[') ||
                        (current == ')' && top != '(') ||
                        (current == '}' && top != '{')) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        System.out.println(solution.isValid("()"));
        // Expected: true

        System.out.println(solution.isValid("()[]{}"));
        // Expected: true

        System.out.println(solution.isValid("(]"));
        // Expected: false

        System.out.println(solution.isValid("([])"));
        // Expected: true

        System.out.println(solution.isValid("([)]"));
        // Expected: false

        System.out.println(solution.isValid("{[]}"));
        // Expected: true

        System.out.println(solution.isValid("((()))"));
        // Expected: true

        System.out.println(solution.isValid("((())"));
        // Expected: false

        System.out.println(solution.isValid(")("));
        // Expected: false

        System.out.println(solution.isValid("]"));
        // Expected: false

        System.out.println(solution.isValid("["));
        // Expected: false

        System.out.println(solution.isValid(""));
        // Expected: true (LeetCode may not provide this input, but it's a good edge case.)

        System.out.println(solution.isValid("{{{{"));
        // Expected: false

        System.out.println(solution.isValid("}}}}"));
        // Expected: false

        System.out.println(solution.isValid("()[{}]"));
        // Expected: true
    }
}
