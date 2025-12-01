package coding101days.day22;

import java.util.HashMap;

/**
 * Day 22 — First Unique Character in a String
 * LeetCode #387
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (since only 26 lowercase letters)
 */
public class Day22FirstUniqueCharacter {

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s)); // Output: 2
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first char with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
