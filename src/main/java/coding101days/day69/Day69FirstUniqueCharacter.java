package coding101days.day69;

import java.util.HashMap;
import java.util.Map;

/**
 * Day 69 — First Unique Character in a String
 * LeetCode #387
 *
 * Pattern: HashMap + Traversal
 */
public class Day69FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
