package coding101days.day23;

import java.util.HashMap;

/**
 * Day 23 — Valid Anagram
 * LeetCode #242
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (since only lowercase letters)
 */
public class Day23ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t)); // true
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Decrease counts using t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }
}
