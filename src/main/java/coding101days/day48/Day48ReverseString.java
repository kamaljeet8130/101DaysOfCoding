package coding101days.day48;

/**
 * Day 48 — Reverse String
 * LeetCode #344
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) [recursive stack]
 */
public class Day48ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s, 0, s.length - 1);

        for (char c : s) {
            System.out.print(c + " ");
        }
    }

    public static void reverseString(char[] s, int left, int right) {
        // Base case
        if (left >= right) {
            return;
        }

        // Swap characters
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // Recursive call
        reverseString(s, left + 1, right - 1);
    }
}
