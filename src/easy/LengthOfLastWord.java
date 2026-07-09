package easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        System.out.println(solution.lengthOfLastWord("Hello World"));
        // Expected: 5

        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));
        // Expected: 4

        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
        // Expected: 6

        System.out.println(solution.lengthOfLastWord("a"));
        // Expected: 1

        System.out.println(solution.lengthOfLastWord("a "));
        // Expected: 1

        System.out.println(solution.lengthOfLastWord(" day"));
        // Expected: 3

        System.out.println(solution.lengthOfLastWord("today"));
        // Expected: 5

        System.out.println(solution.lengthOfLastWord("   hello   "));
        // Expected: 5

        System.out.println(solution.lengthOfLastWord("one two three"));
        // Expected: 5
    }
}
